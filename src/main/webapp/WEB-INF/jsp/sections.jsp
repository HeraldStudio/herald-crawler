<%--
    Document   : sections
    Created on : 2013-2-13, 22:12:28
    Author     : rAy <predator.ray@gmail.com>
--%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach items="${sectionLinks}" var="sectionLink">
<li class="link"><a href="javascript:void(0);">${sectionLink.name}</a></li>
<c:if test="${!(empty sectionLink.subSections)}">
    <c:set var="sectionLinks" value="${sectionLink.subSections}" scope="request" />
<ul class="nav nav-list">
    <jsp:include page="/WEB-INF/jsp/sections.jsp" />
</ul>
</c:if>
</c:forEach>
