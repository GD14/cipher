<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: GD14
  Date: 2017/8/26
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>登录</title>
    <script  type="text/javascript" src="<%=path%>/js/static/jquery-3.2.1.min.js"></script>


    <link rel="stylesheet" href="<%=path%>/css/login.css" type="text/css" />
</head>
<body>
<div div class="login-form">
    <form>
        <input type="text" name="phone"class="login-input user-name"placeholder="用户名"/>
        <input type="password" name="passwd"class="login-input user-pwd"placeholder="密码"/>
        <div class="user-type">
            <label class="radio">
                <input name="userType" type="radio" checked="checked" value="0">客户
            </label>
            <label class="radio">
                <input name="userType" type="radio" value="1">管理人员
            </label>
        </div>

        <input type="submit" value="登录"class="login-sub" >
    </form>
</div>
</body>
<script>
    $(".login-sub").click(function(){
        var userName=$(".user-name").val();
        var userPwd=$(".user-pwd").val();
        var userType=$(".user-type").find("input:checked").val();
        if(userName==null|userPwd==null){
            return;
        }
        var url="<%=path%>/api/customer/signIn";
        var data={
            phone: userName,
            passwd: userPwd,
            type: userType,
        };
        $.ajax({
            type: 'POST',
            url: url,
            data: data,
            success: function(result){
                if(result.errno==0){
                    if(userType=="0"){
                        window.location.href='<%=path%>/query/cusQuery;'
                    }else{
                        window.location.href='<%=path%>/query/empQuery;'
                    }
                }
            },
        });
    });
</script>
</html>
