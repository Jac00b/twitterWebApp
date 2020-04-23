<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="pl.sda.DiscussionService" %>
<%@ page import="pl.sda.model.Discussion" %><%--
  Created by IntelliJ IDEA.
  User: jakub
  Date: 20.04.2020
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Tweets</title>
</head>
<body><% List<Discussion> twiits = DiscussionService.getTwiits();
        request.setAttribute("twiits", twiits);
        String user = (String)request.getSession().getAttribute("user");
        request.setAttribute("user", user);
%>


<a href="${pageContext.request.contextPath}/add-form">Dodaj wpis</a>
<a href="${pageContext.request.contextPath}/logout">Wyloguj się</a>


<h2>Wpisy użytkowników, twoje wpisy zaznaczone są na żółto</h2>
<table>
    <thead>
    <tr>Użytkownik</tr>
    <tr>Tytuł</tr>
    <tr>Wpis</tr>
    </thead>

    <tbody><c:forEach var="tweet" items="${twiits}">
        <c:choose><c:when test="${tweet.login.equals(user)}"><tr style="background-color: yellow">
            <td>${tweet.login}</td>
            <td>${tweet.title}</td>
            <td>${tweet.text}</td>
        </tr>
        </c:when>
            <c:otherwise><tr>
                <td>${tweet.login}</td>
                <td>${tweet.title}</td>
                <td>${tweet.text}</td>
            </tr></c:otherwise>
        </c:choose>
    </c:forEach>  </tbody>

</table>
</body>
</html>
