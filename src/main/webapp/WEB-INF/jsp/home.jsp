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
            <div id="allSections" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h3 id="myModalLabel">所有的栏目</h3>
              </div>
              <div class="modal-body">
                <ul class="sub-list">
                    <label class="checkbox">
                      <input type="checkbox" value="">
                      Option A
                    </label>
                    <li>
                        <label class="checkbox">
                          <input type="checkbox" value="">
                          Option A1
                        </label>
                    </li>
                    <li>
                        <label class="checkbox">
                          <input type="checkbox" value="">
                          Option A2
                        </label>
                    </li>
                </ul>
                <ul class="sub-list">
                    <label class="checkbox">
                      <input type="checkbox" value="">
                      Option B
                    </label>
                    <li>
                        <label class="checkbox">
                          <input type="checkbox" value="">
                          Option B1
                        </label>
                    </li>
                    <li>
                        <label class="checkbox">
                          <input type="checkbox" value="">
                          Option B2
                        </label>
                    </li>
                    <li>
                        <label class="checkbox">
                          <input type="checkbox" value="">
                          Option B3
                        </label>
                    </li>
                </ul>
                <ul class="sub-list">
                    <label class="checkbox">
                      <input type="checkbox" value="">
                      Option C
                    </label>
                    <li>
                        <ul class="sub-list">
                            <label class="checkbox">
                              <input type="checkbox" value="">
                              Option C1
                            </label>
                            <li>
                                <label class="checkbox">
                                  <input type="checkbox" value="">
                                  Option C11
                                </label>
                            </li>
                        </ul>
                    </li>
                </ul>
              </div>
              <div class="modal-footer">
                <button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
                <button class="btn btn-primary">提交</button>
              </div>
            </div>
            <li class="nav-header">我的栏目
                <span class="more-section"><a href="#allSections" data-toggle="modal">管理</a></span>
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
              </div>
              <!-- THE SECOND SPAN -->
              <div id="span2" class="span3">
              </div>
              <!-- THE THIRD SPAN -->
              <div id="span3" class="span3">
              </div> <!-- END OF THIRD SPAN -->
          </div> <!-- END OF THUMBNAILS -->
          <div class="row">
            <div id="loading">
                <img src="<c:url value="/static/img/loading.gif" />" />
                <p>载入中…</p>
            </div>
          </div>
      </div> <!-- END OF SPAN 9 -->
    </div> <!-- END OF Docs nav (row) -->

  </div> <!-- END OF CONTENT (container) -->
  <script type="text/javascript">
    $(document).ready(function () {
        getBlocks('<c:out value="${allUri}" />');
        $(window).scroll(function () {
            // judge the position
            // load
        });
        $('.link').click(function () {
            $('.link').removeClass("active");
            $(this).addClass("active");
        });
    });
  </script>z