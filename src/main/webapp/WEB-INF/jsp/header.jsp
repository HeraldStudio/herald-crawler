<%--
    Document   : header
    Created on : 2013-2-13, 22:33:13
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
    <script src="<c:url value="/static/js/jquery-1.8.1.min.js" />"></script>
    <script src="<c:url value="/static/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="/static/js/entry-blocks.js" />"></script>
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
                <c:choose>
                    <c:when test="${empty loggedInUser}">
              <li>
                  <a href="<c:url value="/login" />">登录</a>
              </li>
                    </c:when>
                    <c:otherwise>
              <form action="<c:url value="/logout" />" method="post" id="logout" class="invisible"></form>
              <li class="dropdown">
                  <a class="dropdown-toggle" data-toggle="dropdown">${loggedInUser.nickname}&nbsp;<b class="caret"></b></a>
                  <ul class="dropdown-menu">
                    <li><a href="#">个人资料</a></li>
                    <li><a href="#">我的栏目</a></li>
                    <li><a href="#">意见反馈</a></li>
                    <li class="divider"></li>
                    <li><a href="#" onclick="$('#logout').submit();">注销</a></li>
                  </ul>
              </li>
                  </c:otherwise>
                </c:choose>
            </ul>
          </div>
        </div>
      </div>
    </div> <!-- END OF NAVBAR -->