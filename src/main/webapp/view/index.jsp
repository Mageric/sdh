<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h1>添加用户</h1>
<form action="${pageContext.request.contextPath}/user/add">
    <p>Name: <input type="text" name="name" /></p>
    <p>Pwd: <input type="password" name="pwd" /></p>
    <input type="submit" value="Submit" />
</form>
</body>
</html>
