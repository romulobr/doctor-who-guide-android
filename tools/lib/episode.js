var moment = require('moment');
var imdbDateParser = require('./imdbDateParser.js').create(moment);

var create = function (id, episodeData, season, number) {
    return {
        id:id,
        name: episodeData.episodeName.text,
        season: season,
        number: number,
        imdbUrl: episodeData.episodeName.href,
        synopsys: episodeData.episodeSynopsys,
        releaseDate: imdbDateParser.parse(episodeData.releaseDate),
        generateJava: function () {
            return "new Episode(" + id +
                ", " + this.season +
                ", " + this.number +
                ", \"" + this.name + "\"" +
                ", \"" + this.synopsys + "\"" +
                ", sdf.parse(\"" + this.releaseDate.format('DD-MM-YYYY') + "\"))";
        }
    };
}

exports.create = create;