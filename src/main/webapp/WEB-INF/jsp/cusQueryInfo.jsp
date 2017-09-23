<%--
  Created by IntelliJ IDEA.
  User: luter
  Date: 2017-9-7-0007
  Time: 下午 2:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>Title</title>
    <script  type="text/javascript" src="<%=path%>/js/static/jquery-3.2.1.min.js"></script>
    <script  type="text/javascript" src="<%=path%>/js/static/vue.js"></script>
    <script  type="text/javascript" src="<%=path%>/js/queryCus.js"></script>
    <link rel="stylesheet" href="<%=path%>/css/static/bootstrap.min.css" type="text/css" />
    <link rel="stylesheet" href="<%=path%>/css/cusQuery.css" type="text/css" />
</head>

<body>
<div class="row">
    <div class="main-nav col-md-3">
        <div class="user-name text-center">${customer.cust_name}</div>
        <div class="nav-ul text-center">
            <ul class="list-unstyled">
                <li>主页</li>
                <li class="nav-visiting" onclick="window.location.href='<%=path%>/query/cusQuery;'">查询</li>
                <li>消息</li>
            </ul>
        </div>
    </div>
    <div class="main-query col-md-9">
        <div class="query-title">
            <p>查询</p>
            <hr/>
        </div>
        <div  id="cusInfo" class="cusInfo">
            <dl class="dl-horizontal"  v-for="(value, key) in object">
                <dt>{{ key }}:</dt>
                <dd>{{ value }}</dd>
            </dl>
        </div>

    </div>
</div>
</body>
<script>


    var cusInfoD={
        姓名:"${customer.cust_name}",
        性别:"${customer.cust_sex}",
        手机号码:"${customer.cust_nbr}",
        最近更新时间:"${customer.updateTime}",
        注册时间:"${customer.login_time}"
     };
    new Vue({
        el: '#cusInfo',
        data: {
            object:cusInfoD
        }
    })

</script>
</html>
