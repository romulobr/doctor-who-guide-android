var Episode = require('./lib/episode.js');
var Parser = require('./lib/episodeParser.js');
var jsonFile = require('jsonfile');

var parser = Parser.create(jsonFile, Episode);

function parseSeason(file, seasonNumber, startingId) {
    parser.readFile(file, function (erro, obj) {
    var id = startingId-1;
    var episodeNumber = 1;
    var season = seasonNumber;
        for (episodeNumber=1; episodeNumber<=obj.length; episodeNumber++) {
            id++;
            console.log(parser.createEpisode(id,obj[episodeNumber-1],season,episodeNumber).generateJava()+",");
        }
    });
}

parseSeason('./seasons/season3.json',2,28);
