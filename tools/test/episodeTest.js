var chai = require('chai');
var expect = require('chai').expect;
var Episode = require('../lib/episode.js');
var moment = require('moment');

describe('Episode', function () {
    var episode1 = {
        "episodeName": {
            "text": "Rose",
            "href": "http://www.imdb.com/title/tt0562992/?ref_=tt_ep_ep1"
        },
        "episodeSynopsys": "Rose Tyler is...",
        "releaseDate": "17 Mar. 2006"
    };

    var id = 4;
    var season = 1;
    var number = 10;
    var convertedEpisode1 = Episode.create(id, episode1, season, number);

    it('is created with episode data, season and episode number', function () {
        expect(episode1.episodeName.text).to.equal(convertedEpisode1.name);
        expect(episode1.episodeName.href).to.equal(convertedEpisode1.imdbUrl);
        expect(episode1.episodeSynopsys).to.equal(convertedEpisode1.synopsys);
        expect(season).to.equal(convertedEpisode1.season);
        expect(number).to.equal(convertedEpisode1.number);
        expect(id).to.equal(convertedEpisode1.id);
        expect(moment("03/17/2006").toString()).to.equal(convertedEpisode1.releaseDate.toString());
    });

    it('generates java code for episode creation', function () {
        var generatedJavaCode = convertedEpisode1.generateJava();
        var expectedjavaCode = "new Episode(4, 1, 10, \"Rose\", \"Rose Tyler is...\", sdf.parse(\"17-03-2006\"))";
        expect(generatedJavaCode).to.equal(expectedjavaCode);
    });
});