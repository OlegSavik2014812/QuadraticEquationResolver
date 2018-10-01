<%@ page contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<form action="calculate" method="get">
    <input type="text" id="inputLogin" name="factorA" class="form-control"
           placeholder="A">
    <input type="password" id="inputPassword" name="factorB" class="form-control"
           placeholder="B">
    <input type="password" id="inputPassworssdf" name="factorC" class="form-control"
           placeholder="C">

    <button class="btn btn-lg btn-primary btn-block" type="submit"><@spring.message 'login'/></button>
</form>

</body>
</html>
