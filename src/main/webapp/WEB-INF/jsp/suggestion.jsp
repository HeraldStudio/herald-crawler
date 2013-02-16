<%--
    Document   : suggestion
    Created on : 2013-2-16, 14:49:42
    Author     : rAy <predator.ray@gmail.com>
--%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/jsp/header.jsp" %>

  <div class="container" id="content">
    <form class="form-signin">
      <fieldset>
        <legend>意见反馈</legend>
        <label>写下您的意见与建议：</label>
        <p><textarea name="content"></textarea></p>
        <p><button type="submit" class="btn">提交</button></p>
      </fieldset>
    </form>
  </div>
<%@include file="/WEB-INF/jsp/footer.jsp" %>