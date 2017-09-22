<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>Title</title>
    <script  type="text/javascript" src="<%=path%>/js/static/jquery-3.2.1.min.js"></script>
    <script  type="text/javascript" src="<%=path%>/js/static/vue.js"></script>

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
        <div  id="cusPro" class="cusPro">
            <dl class="dl-horizontal"  v-for="(value, key) in object">
                <dt>{{ key }}:</dt>
                <dd>{{ value }}</dd>
            </dl>
        </div>

    </div>
</div>
</body>
<script>
    var cusProD={
        当前套餐:"联通大宝卡",
        套餐余量:"语音剩余40分钟；流量剩余1G",
        资费类型:"36元",

    };
    new Vue({
        el: '#cusPro',
        data: {
            object:cusProD
        }
    })

</script>
</html>