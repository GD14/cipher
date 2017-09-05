<%--
  Created by IntelliJ IDEA.
  User: wh
  Date: 2017/8/29
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="http://lib.sinaapp.com/js/jquery/1.9.1/jquery-1.9.1.min.js"></script>
    <%--<script>--%>
        <%--$(document).ready(function(){--%>
            <%--$("#logout").click(function() {--%>
                <%--$.ajax({--%>
                    <%--type: 'GET',--%>
                    <%--url: '/logOut' ,--%>
                    <%--success: function(data) {--%>
                        <%--$("#result").text(data.content);--%>
                        <%--$("#username").val('');--%>
                        <%--$("#token").val('');--%>
                    <%--},--%>
                    <%--error: function() {--%>
                        <%--$("#result").text("未登录");--%>
                        <%--$("#username").val('');--%>
                        <%--$("#token").val('');--%>
                    <%--},--%>
                <%--});--%>
            <%--});--%>
        <%--});--%>
    <%--</script>--%>
</head>
<body>
    <P>welcome ${userinfo.username}!</P>
    <form action="/logOut">
        <input type="submit" value="注销" >
    </form>

</body>

</html>
