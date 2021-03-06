// ===========================
// get required packages =====
// ===========================
var express = require('express'); // most important module. Used to create express app
var path = require('path'); // for accessing directory paths
var favicon = require('serve-favicon'); // to serve fevicon logo
var morganLogger = require('morgan'); // for logging every request on console
var cookieParser = require('cookie-parser'); // to handle cookies
var bodyParser = require('body-parser'); // for parsing post request body
var boom = require('express-boom'); // for getting HTTP-friendly error objects
var sassMiddleware = require('node-sass-middleware'); // to use SASS CSS preprocessor
var mongoose = require('mongoose'); // to query mongoDB
var config = require('./config'); // get our config file
var compression = require('compression');

var app = express(); // Creates an Express application

console.log(boom);
// ===========================
// view engine setup =========
// ===========================
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'pug');
app.set('superSecret', config.secret);


// ===========================
// get all route files =======
// ===========================
var index = require('./routes/index');
var signup = require('./routes/apis/signup');
var authenticate = require('./routes/apis/authenticate');
var apis = require('./routes/apis');


// ===========================
// use required packages =====
// ===========================

// uncomment after placing your favicon in /public
//app.use(favicon(path.join(__dirname, 'public', 'favicon.ico')));
app.use(compression()); // use compression to compress every response object (improves performance)
app.use(morganLogger('dev')); // use morgan to log requests to the console for development use
app.use(bodyParser.json()); // Parse json content from request body
app.use(bodyParser.urlencoded({
    extended: false
})); // Parses URL encoded data as plain text & exposes the resulting object (containing keys & values) on req.body
app.use(boom()); // for throwing http friendly error messages
app.use(cookieParser()); // used to parse cookie data
app.use(sassMiddleware({
    src: path.join(__dirname, 'public'),
    dest: path.join(__dirname, 'public'),
    indentedSyntax: true,
    sourceMap: true
})); // configure sassMiddleware to preprocess sass files based on configurations
app.use(express.static(path.join(__dirname, 'public'))); // used to serve static content in directory & sub directories


// ===========================
// base api endpoints ========
// ===========================
app.use('/', index);
app.use('/signup', signup);
app.use('/authenticate', authenticate);
app.use('/api', apis);


// ===========================
// error handlers ============
// ===========================

// catch 404 and forward to error handler
app.use(function(req, res, next) {
    var err = new Error('Not Found');
    err.status = 404;
    next(err);
});

// for development environment, print stacktrace. For production environment, no stacktraces should be leaked to user
app.use(function(err, req, res, next) {
    // set locals, only providing error in development
    res.locals.message = err.message;
    res.locals.error = req.app.get('env') === 'development' ? err : {};

    // render the error page
    res.status(err.status || 500);
    res.render('error');
});


// ===========================
// db configurations =========
// ===========================

// Using native (ES6) promise instead of depricated mongoose Promise
mongoose.Promise = global.Promise;

// Connect to db
mongoose.connect(config.databaseURL + '/' + config.databaseName);

// Connected handler
mongoose.connection.on('connected', function(err) {
    console.log("Connected to DB: " + config.databaseName);
});

// Error handler
mongoose.connection.on('error', function(err) {
    console.log(err);
});

// Reconnect when closed
mongoose.connection.on('disconnected', function() {
    console.log('Mongoose disconnected');
    mongoose.createConnection(config.databaseURL + '/' + config.databaseName);
});

// Close the Mongoose connection if node process ends
process.on('SIGINT', function() {
    mongoose.connection.close(function () {
        console.log('Mongoose disconnected since server terminated');
        process.exit(0);
    });
});

// Close the Mongoose connection after responding to the request
app.use(function(req, res, next) {
  // action after response
  var afterResponse = function() {
    console.log('Closing db connection');

    // any other clean ups
    mongoose.connection.close(function() {
      console.log('Mongoose connection disconnected');
    });

    // hooks to execute after response
    res.on('finish', afterResponse);
    res.on('close', afterResponse);

    next();
  }
});

module.exports = app;
