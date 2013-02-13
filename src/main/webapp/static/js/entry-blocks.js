function getBlocks(uri) {
    if (uri == '') {
        return;
    }
    var offset = $('#thumbnail').length;
    alert(offset);
    uri = uri + '&offset=' + offset;
    alert(uri);
    $.ajax({
        url : "/",
        success : function(data) {
            alert(data);
            parseJson(data);
        }
    });
}

function parseJson(jsonStr) {
    var json = jQuery.parseJSON(jsonStr);
    var blocks = json.blocks;
    var loadingHtml = $('#loading').html();
    $('#loading').remove();

    var count = 0;
    for (count = 0; count < blocks.length; ++count) {
        var block = blocks[count];
        var imageUrl = block.imageUrl;
        var text = block.text;
        var tags = block.tags;
        var link = block.link;
        renderDivision(imageUrl, text, tags, link);
        count++;
    }
    if (count > 0) {
        var shortest = getShortestSpan();
        var loadingDiv = "<div class=\"thumbnail\" id=\"loading\">";
        loadingDiv += loadingHtml;
        loadingDiv += "</div>";
        shortest.append(loadingDiv);
    } else {
        noMore();
    }
}

function renderDivision(imageUrl, text, tags, link) {
    var div = "<div class=\"thumbnail\">";
    if (imageUrl != undefined) {
        div += "<img src=\"" + imageUrl + "\" />";
    }
    div += "<p>" + text + "</p><p>";
    for (var i = 0; i < tags.length; ++i) {
        div += "<span class=\"label label-info\">" + tags[i] + "</span>";
    }
    div += "</p><p class=\"more\"><a class=\"btn btn-link\" href=\"" + link + "\">详情</a></p></div>"
    var shortest = getShortestSpan();
    shortest.append(div);
}

function getShortestSpan() {
    var span1 = $('#blocks').children(".span3").eq(0);
    var span2 = $('#blocks').children(".span3").eq(1);
    var span3 = $('#blocks').children(".span3").eq(2);
    var shortest = getShortestElement(span1, getShortestElement(span2, span3));
    return shortest;
}
function noMore() {
    var noMoreDiv = "<div class=\"thumbnail\"><p>没有更多的结果。</p>" +
        "<p class=\"top\"><a class=\"icon-arrow-up\" />" +
        "<a href=\"#\">回到顶部</a></p></div>";
    var shortest = getShortestSpan();
    shortest.append(noMoreDiv);
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