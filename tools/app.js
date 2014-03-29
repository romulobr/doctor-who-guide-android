var jf = require('jsonfile')
    ,util = require('util');

var file = './seasons/season1.json';
jf.readFile(file, function(err, obj) {
  console.log(util.inspect(obj[0]));
});