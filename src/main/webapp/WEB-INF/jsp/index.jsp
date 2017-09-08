<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: GD14
  Date: 2017/8/26
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <%--<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.5.2/jquery.min.js" type="text/javascript"></script>--%>
</head>
<body>

<form action="${pageContext.request.contextPath}/api/customer/signIn" method="post">
    手机号:<input type="text" name="phone"/>
    密码:  <input type="userPass" name="passwd"/>
<input type="submit" value="登录">
</form>
</body>
</html>
