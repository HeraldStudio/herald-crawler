<%--
    Document   : login
    Created on : 2013-2-12, 18:04:59
    Author     : rAy <predator.ray@gmail.com>
--%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/WEB-INF/jsp/header.jsp" %>

  <div class="container" id="content">
      <form class="form-signin" method="post">
        <h2 class="form-signin-heading">先声爬虫 - 登录</h2>
        <input type="text" name="username" class="input-block-level" placeholder="一卡通">
        <input type="password" name="password" class="input-block-level" placeholder="密码">
        <label class="checkbox">
        <input type="checkbox" value="remember-me"> 记住我
        </label>
        <button class="btn btn-primary" type="submit">登录</button>
    </form>
  </div> <!-- END OF LOGIN (container) -->

<%@include file="/WEB-INF/jsp/footer.jsp" %>
