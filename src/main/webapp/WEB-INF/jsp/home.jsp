<%--
    Document   : home
    Created on : 2013-2-11, 22:52:18
    Author     : rAy <predator.ray@gmail.com>
--%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/jsp/header.jsp" %>

  <div class="container" id="content">

    <!-- Docs nav
    ================================================== -->
    <div class="row">
      <div class="span3">
        <ul class="nav nav-list">
            <li class="nav-header">我的栏目
                <span class="more-section"><a href="#">添加</a></span>
            </li>
            <li class="link active"><a href="javascript:void(0);" onclick="getBlocks('<c:out value="${allUri}" />')">全部</a></li>
            <jsp:include page="/WEB-INF/jsp/sections.jsp" />

            <li class="nav-header">我的归档</li>
            <c:forEach items="${archiveLinks}" var="archiveLink">
            <li class="link">
                <a href="${archiveLinks.uri}">${archiveLink.name}</a>
            </li>
            </c:forEach>
        </ul>
      </div> <!-- END OF SPAN 3 -->
      <div class="span9">
          <div class="row">
              <div class="span3 offset6">
                  <form class="form-search">
                    <div class="input-append">
                      <input class="span2" id="appendedInputButton" type="text">
                      <button class="btn" type="button">搜索</button>
                    </div>
                  </form>
              </div>
          </div> <!-- END OF SEARCH BAR -->
          <div id="blocks" class="row">
              <!-- THE FIRST SPAN -->
              <div id="span1" class="span3">
                  <div class="thumbnail" id="loading">
                      <img src="<c:url value="/static/img/loading.gif" />" />
                      <p>载入中…</p>
                  </div>
              </div>
              <!-- THE SECOND SPAN -->
              <div id="span2" class="span3">
              </div>
              <!-- THE THIRD SPAN -->
              <div id="span3" class="span3">
              </div> <!-- END OF THIRD SPAN -->
          </div> <!-- END OF THUMBNAILS -->
      </div> <!-- END OF SPAN 9 -->
    </div> <!-- END OF Docs nav (row) -->

  </div> <!-- END OF CONTENT (container) -->
  <script type="text/javascript">
    $(document).ready(function () {
        // getBlocks('<c:out value="${uri}" />');
        parseJson('{"blocks":[' +
            // first
            '{"imageUrl":"http://localhost:8084/herald-crawler/static/img/holder_300x200.png",' +
            '"link":"#",' +
            '"tags":["讲座","新闻"],' +
            '"text":"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris convallis eleifend blandit. In hac habitasse platea dictumst. Suspendisse vel mi dolor."' +
            '}' +
            ',' +
            // second
            '{"imageUrl":"http://localhost:8084/herald-crawler/static/img/holder_300x200.png",' +
            '"link":"#",' +
            '"tags":["新闻"],' +
            '"text":"Mauris convallis eleifend blandit. In hac habitasse platea dictumst. Suspendisse vel mi dolor."' +
            '}' +
            ']}');
        parseJson('{"blocks":[]}');
        $(window).scroll(function () {
            // judge the position
            // load
        });
        $('.link').click(function () {
            $('.link').removeClass("active");
            $(this).addClass("active");
        });
    });
  </script>

<%@include file="/WEB-INF/jsp/footer.jsp" %>