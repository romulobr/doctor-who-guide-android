var fixMonthInDate = function (imdbDate) {
    return imdbDate.replace('Jan.', 'january')
           .replace('Feb.', 'february')
           .replace('Mar.', 'march')
           .replace('May', 'may')
           .replace('Jun.', 'june')
           .replace('Jul.', 'july')
           .replace('Aug.', 'august')
           .replace('Sep.', 'september')
           .replace('Out.', 'october')
           .replace('Nov.', 'november')
           .replace('Dec.', 'december');
}

var create = function (moment) {
    return {
        parse: function(imdbDate) {
            return moment(fixMonthInDate(imdbDate),'DD MMM YYYY');
        }
    };
}

exports.create = create;