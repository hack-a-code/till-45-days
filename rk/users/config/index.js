 module.exports = {
     'secret': process.env.SESSION_SECRET || '$0mE StRO^g $*cR*t', // set strong secret key - used for encryption & decryption
     'databaseURL': process.env.DB_URL || 'mongodb://localhost:27017', // db connection url
     'databaseName': process.env.DB_SCHEMA || 'usersDB' // db name
 };
