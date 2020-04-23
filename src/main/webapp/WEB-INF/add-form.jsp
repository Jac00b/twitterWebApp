<%--
  Created by IntelliJ IDEA.
  User: jakub
  Date: 22.04.2020
  Time: 23:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Dodawanie twiiterek</title>
</head>
<body>


Dodaj wpis :

<form action="addConfirm" method="POST">
    <p>Tytuł: <input type="text" name="title"/></p>
    <p>Treść: <input type="text" name="text"/></p>
    <p><input type="submit" value="Opublikuj"/></p>
</form>
</body>
</html>
