<%--
  Created by IntelliJ IDEA.
  User: luter
  Date: 2017-9-5-0005
  Time: 下午 2:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>

<html>
<head>
    <title>Query</title>

    <script  type="text/javascript" src="<%=path%>/js/static/jquery-3.2.1.min.js"></script>
    <script  type="text/javascript" src="<%=path%>/js/static/vue.js"></script>
    <script  type="text/javascript" src="<%=path%>/js/static/bootstrap-datetimepicker.min.js"></script>

    <link rel="stylesheet" href="<%=path%>/css/static/bootstrap.min.css" type="text/css" />
    <link rel="stylesheet" href="<%=path%>/css/static/bootstrap-theme.min.css" type="text/css" />
    <link rel="stylesheet" href="<%=path%>/css/static/bootstrap-datetimepicker.min.css" type="text/css" />
    <link rel="stylesheet" href="<%=path%>/css/cusQuery.css" type="text/css" />

</head>

<body>
<div class="row">
    <div class="main-nav col-md-3">
      <div class="user-name text-center">${customer.custName}</div>
      <div class="nav-ul text-center">
          <ul class="list-unstyled">
              <li>主页</li>
              <li class="nav-visiting">查询</li>
              <li>消息</li>
          </ul>
      </div>
    </div>
    <div class="main-query col-md-9">
        <div class="query-title">
            <p>查询</p>
            <hr/>
        </div>
        <div id="cus-query">
            <div class="query-category" onclick="window.location.href='<%=path%>/query/cusQueryInfo;'">个人信息</div>
            <div class="query-category" onclick="window.location.href='<%=path%>/query/cusQueryPro;'">我的套餐</div>
            <div class="query-category" onclick="window.location.href='<%=path%>/query/cusQueryCalls;'">通话详单</div>
            <div class="query-category" onclick="window.location.href='<%=path%>/query/cusQueryMes;'">短信详单</div>
        </div>
    </div>
</div>
</body>
<script>

</script>
</html>
