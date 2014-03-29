var expect = require('chai').expect
var moment = require('moment');
var ImdbParser = require('../lib/imdbDateParser');

describe('IMDB date parser', function (){
    it('parses date formatted in the imdb site format', function() {
        parser = ImdbParser.create(moment);
        var parsedDate = parser.parse('5 May 2006');
        expect(parsedDate.toString()).to.equal(moment('05/05/2006').toString());
    });
});