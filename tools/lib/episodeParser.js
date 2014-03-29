var create = function (jsonFile, Episode) {
    return {
        readFile: function (fileName, callBack) {
            jsonFile.readFile(fileName, callBack);
        },
        createEpisode: function (id, episodeData, season, number) {
            return Episode.create(id, episodeData, season, number);
        }
    }
};

exports.create = create;
