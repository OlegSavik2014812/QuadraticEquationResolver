<%@ page contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <%@ page isELIgnored="false" %>
</head>
<body>
<form action="calculate" method="get">
    <input type="text" name="factorA" placeholder="A">
    <input type="text" name="factorB" placeholder="B">
    <input type="text" name="factorC" placeholder="C">
    <button type="submit">find roots</button>
</form>
<h3>${solution}</h3>
</body>
</html>
