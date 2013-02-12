function getBlocks(uri) {
    if (uri == '') {
        return;
    }
    var offset = $('#thumbnail').length;
    uri = uri + '&offset=' + offset;
    $.get(uri, function (response, status, xhr) {
        if (xhr.status == 200) {
            parseJson(response);
        }
    }, "json");
}

function parseJson(json) {
    var blocks = json.blocks;
    for (var block in blocks) {
        var imageUrl = block.imageUrl;
        var text = block.text;
        var tags = block.tags;
        var link = block.link;
        renderDivision(imageUrl, text, tags, link)
    }
}

function renderDivision(imageUrl, text, tags, link) {
    var div = "<div class=\"thumbnail\"><img src=\"" + imageUrl + "\" />" +
    "<p>" + text + "</p><p>";
    for (var tag in tags) {
        div += "<span class=\"label label-info\">" + tag + "</span>";
    }
    div += "</p><p class=\"more\"><a class=\"btn btn-link\" href=\"" + link + "\">详情</a></p></div>"
    var span1 = $('#blocks').children(".span3")[0];
    var span2 = $('#blocks').children(".span3")[1];
    var span3 = $('#blocks').children(".span3")[2];
    var shortest = getShortestElement(span1, getShortestElement(span2, span3));
    shortest.append(div);
}

function getShortestElement(e1, e2) {
    var shortest;
    if (e1.height() <= e2.height()) {
        shortest = e1;
    } else {
        shortest = e2;
    }
    return shortest;
}