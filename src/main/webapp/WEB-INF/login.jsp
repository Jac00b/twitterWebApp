<%--
  Created by IntelliJ IDEA.
  User: jakub
  Date: 20.04.2020
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<h1>Witamy na stronie twitter, zaloguj się aby przejrzeć wpisy lub załóż konto</h1>
<a href="${pageContext.request.contextPath}/register">Zarejestruj się</a>

<form action="login" method="POST">
    <p>Login: <input type="text" name="login"/></p>
    <p>Password: <input type="password" name="password"/></p>
    <p><input type="submit" value="Zaloguj się"/></p>

</form>
</body>
</html>
