<%--
  Created by IntelliJ IDEA.
  User: jakub
  Date: 22.04.2020
  Time: 23:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Zarejestruj się</title>
</head>
<body>

<h1>Zarejestruj się wpisując dane poniżej lub <a href="${pageContext.request.contextPath}/"> wróć do strony początkowej</a></h1>
<form action="add-user" method="POST">
    <p>Login: <input type="text" name="login"/></p>
    <p>Password: <input type="password" name="password"/></p>
    <p><input type="submit" value="Zarejestruj się"/></p>

</form>

</body>
</html>
