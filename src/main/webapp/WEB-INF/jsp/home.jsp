<%--
    Document   : home
    Created on : 2013-2-11, 22:52:18
    Author     : rAy <predator.ray@gmail.com>
--%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link href="<c:url value="/static/css/bootstrap.css" />" rel="stylesheet" />
    <link href="<c:url value="/static/css/style.css" />" rel="stylesheet" />
    <style>
    <!--
    body {
        background-image: url("<c:url value="/static/img/kindajean.png" />");
    }
    -->
    </style>
</head>
<body>
    <!-- Navbar
    ================================================== -->
    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="brand" href="<c:url value="/" />">先声爬虫</a>
          <div id="login-info" class="nav-collapse collapse">
            <ul class="nav">
              <li class="dropdown">
                  <a class="dropdown-toggle" data-toggle="dropdown">zetaplusae&nbsp;<b class="caret"></b></a>
                  <ul class="dropdown-menu">
                    <li><a href="#">个人资料</a></li>
                    <li><a href="#">我的栏目</a></li>
                    <li class="divider"></li>
                    <li><a href="#">注销</a></li>
                  </ul>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div> <!-- END OF NAVBAR -->

  <div class="container" id="content">

    <!-- Docs nav
    ================================================== -->
    <div class="row">
      <div class="span3">
        <ul class="nav nav-list">
            <li class="nav-header">我的栏目
                <span class="more-section"><a href="#">添加</a></span>
            </li>
          <li><a href="#">全部</a></li>
          <li><a href="#">社团信息</a></li>
          <li>
              <a href="#">东大主页</a>
              <ul class="nav nav-list">
                  <li><a href="#">东大新闻</a></li>
                  <li><a href="#">信息公告</a></li>
              </ul>
          </li>
          <li>
              <a href="#">教务处</a>
              <ul class="nav nav-list">
                  <li><a href="#">教务管理</a></li>
                  <li><a href="#">学籍管理</a></li>
              </ul>
          </li>

          <li class="nav-header">我的归档</li>
          <li>
              <a href="#">2013年12月</a>
          </li>
          <li>
              <a href="#">2013年11月</a>
          </li>
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
              <div class="span3">
                  <div class="thumbnail">
                      <img src="<c:url value="/static/img/holder_300x200.png" />" />
                      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris convallis eleifend blandit. In hac habitasse platea dictumst. Suspendisse vel mi dolor.</p>
                      <p>
                          <span class="label label-info">讲座</span>
                      </p>
                      <p class="more">
                          <a class="btn btn-link" href="#">详情</a>
                      </p>
                  </div>
                  <div class="thumbnail">
                      <p>Duis massa nunc, pellentesque quis pellentesque vel, tincidunt in tortor.</p>
                      <p class="more">
                          <a class="btn btn-link" href="#">详情</a>
                      </p>
                  </div>
                  <div class="thumbnail">
                      <img src="<c:url value="/static/img/holder_300x200.png" />" />
                      <p>Duis massa nunc, pellentesque quis pellentesque vel, tincidunt in tortor.</p>
                      <p class="more">
                          <a class="btn btn-link" href="#">详情</a>
                      </p>
                  </div>
              </div>
              <!-- THE SECOND SPAN -->
              <div class="span3">
                  <div class="thumbnail">
                      <img src="<c:url value="/static/img/holder_300x200.png" />" />
                      <p>Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Curabitur iaculis commodo eleifend. Fusce tincidunt tincidunt libero non tincidunt.</p>
                      <p class="more">
                          <a class="btn btn-link" href="#">详情</a>
                      </p>
                  </div>
                  <div class="thumbnail">
                      <img src="<c:url value="/static/img/holder_300x200.png" />" />
                      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris convallis eleifend blandit. In hac habitasse platea dictumst. Suspendisse vel mi dolor.</p>
                      <p class="more">
                          <a class="btn btn-link" href="#">详情</a>
                      </p>
                  </div>
                  <div class="thumbnail">
                      <p>没有更多的结果。</p>
                      <p class="top"><a class="icon-arrow-up" /><a href="#">回到顶部</a></p>
                  </div>
              </div>
              <!-- THE THIRD SPAN -->
              <div class="span3">
                  <div class="thumbnail">
                      <img src="<c:url value="/static/img/holder_300x200.png" />" />
                      <p>Quisque eu rhoncus tortor. Morbi ornare ultrices dui, nec convallis purus cursus adipiscing. In dapibus vehicula velit, eget congue odio dignissim et. </p>
                      <p class="more">
                          <a class="btn btn-link" href="#">详情</a>
                      </p>
                  </div>
                  <div class="thumbnail">
                      <img src="<c:url value="/static/img/holder_300x200.png" />" />
                      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris convallis eleifend blandit. In hac habitasse platea dictumst. Suspendisse vel mi dolor.</p>
                      <p class="more">
                          <a class="btn btn-link" href="#">详情</a>
                      </p>
                  </div>
                  <div class="thumbnail" id="loading">
                      <img src="<c:url value="/static/img/loading.gif" />" />
                      <p>载入中…</p>
                  </div>
              </div> <!-- END OF THIRD SPAN -->
          </div> <!-- END OF THUMBNAILS -->
      </div> <!-- END OF SPAN 9 -->
    </div> <!-- END OF Docs nav (row) -->

  </div> <!-- END OF CONTENT (container) -->
  <footer class="footer">
    <div class="container">
      <p>先声爬虫 - <a href="http://herald.seu.edu.cn/">东南大学先声网</a></p>
    </div>
  </footer>
  <script src="<c:url value="/static/js/jquery-1.8.1.min.js" />"></script>
  <script src="<c:url value="/static/js/bootstrap.min.js" />"></script>
  <script src="<c:url value="/static/js/entry-blocks.js" />"></script>
  <script type="text/javascript">
    $(document).ready(function () {
        getBlocks("<c:out value="${uri}" />");
        $(window).scroll(function () {
            // judge the position
            // load
        });
    });
  </script>
</body>
</html>
