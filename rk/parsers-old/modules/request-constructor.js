var getRequestConstructor = function (modelClass, modelAttributes) {
    //    console.log('Inside Request Constructor');

    var modelClassVar = (modelClass.charAt(0).toLowerCase()) + (modelClass.substr(1));
    var dataMembers = '\t' + 'private PagingInfo pagingInfo;' +
        '\n\n\t' + 'private String tenantId;';

    var reqConstructor = dataMembers +
        '\n\n\t' + 'public ' + modelClass + 'Request(Long id, String name, Boolean active, Integer pageNo, ' +
        'Integer pageSize, String tenantId) {' +
        '\n\t\t' + modelClass + ' ' + modelClassVar + ' = new '+ modelClass + '();' +
        '\n\t\t' + modelClassVar + '.setId(id);' +
        '\n\t\t' + modelClassVar + '.setName(name);' +
        '\n\t\t' + modelClassVar + '.setActive(active);' +
        '\n\t\t' + 'this.set' + modelClass + '(' + modelClassVar + ');' +
        '\n\t\t' + 'this.setPagingInfo(new PagingInfo(pageNo, pageSize, 0, 0));' +
        '\n\t\t' + 'this.tenantId = tenantId;' +
        '\n\t' + '}';

    return reqConstructor;
}

module.exports = getRequestConstructor;