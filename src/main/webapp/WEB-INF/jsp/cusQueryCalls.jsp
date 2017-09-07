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
        <div class="user-name text-center">17607185613</div>
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

        <div class="cusCalls">
            <table id="cusCalls" class="table"  >
                <tr>
                    <th>序号</th><th>主叫用户</th><th>被叫用户</th>
                </tr>
                <tr v-for="n in 3">
                    <td>{{n}}</td>
                    <td>{{object[n].callName.value}}</td>
                    <td>{{object[n].calledName}}</td>
                </tr>
            </table>
        </div>

    </div>
</div>
</body>
<script>
   /* var cusCallsD=[
        {index:"1", callName:"卢桃", calledName:"雯馨"},
        {index:"2", callName:"卢桃", calledName:"雯馨"},
        {index:"3", callName:"卢桃", calledName:"雯馨"}
    ];*/
    new Vue({
        el: '#cusCalls',
        data: {
            object:[
                {num:"1", callName:"卢桃", calledName:"雯馨"},
                {num:"2", callName:"卢桃", calledName:"雯馨"},
                {num:"3", callName:"卢桃", calledName:"雯馨"}
            ]
        }
    })

</script>
</html>