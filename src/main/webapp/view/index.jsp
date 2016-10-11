<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<form action="${pageContext.request.contextPath}/user/add">
    <p>账户名: <input type="text" name="name" title=""/></p>
    <p>密码:  <input type="password" name="pwd" title=""/></p>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>
