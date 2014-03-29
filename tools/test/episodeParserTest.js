var chai = require('chai');
var sinon = require("sinon");
var sinonChai = require('sinon-chai');
var expect = require('chai').expect;
chai.use(sinonChai);

var jsonFile = require('jsonfile');
var Parser = require('../lib/episodeParser.js');
var Episode = {};

describe('java code parser', function () {

    var parser = Parser.create(jsonFile, Episode);

    it('reads the file and parses it automatically', function (done) {
        var episodes;
        parser.readFile('./test/data/test.json', function (error, obj) {
            episodes = obj;
            expect(episodes.length).to.equal(3);
            done();
        });
    });

    it('converts episode object parsed from JSON to domain object', function () {
        var episode1 = {
            fakeEpisode: "true"
        };
        var season = 1;
        var number = 2;
        var id = 3;

        Episode.create = sinon.spy(Episode.create);
        var convertedEpisode1 = parser.createEpisode(id, episode1, season, number);

        expect(Episode.create).to.have.been.calledWith(id, episode1, season, number);
    });
});