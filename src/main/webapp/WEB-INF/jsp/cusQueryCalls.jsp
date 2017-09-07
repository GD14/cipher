<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>Title</title>
    <script  type="text/javascript" src="<%=path%>/js/static/jquery-3.2.1.min.js"></script>
    <script  type="text/javascript" src="<%=path%>/js/static/vue.js"></script>
    <script  type="text/javascript" src="<%=path%>/js/static/bootstrap-datetimepicker.min.js"></script>

    <link rel="stylesheet" href="<%=path%>/css/static/bootstrap.min.css" type="text/css" />
    <link rel="stylesheet" href="<%=path%>/css/static/bootstrap-datetimepicker.min.css" type="text/css" />
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
            <div class="inputCallsSearch">
                <div>自定义时间</div>

                <span>自</span><input size="16" type="text" value="" readonly class="callsPreTime">
                <span>至</span><input size="16" type="text" value="" readonly class="callslasTime">

                <button class="btn btnCallsSearch">搜索</button>

            </div>
            <table id="cusCallsInfo" class="table table-hover"  >
                <tr>
                    <th>序号</th><th>主叫用户</th><th>被叫用户</th>
                </tr>
                <tr v-for="(object,index) in object">
                    <td>{{index+1}}</td>
                    <td>{{object.callName}}</td>
                    <td>{{object.calledName}}</td>
                </tr>
            </table>
        </div>

    </div>
</div>
</body>
<script>
    var cusCallsD=[
        {index:"1", callName:"卢桃", calledName:"雯馨"},
        {index:"2", callName:"卢桃", calledName:"雯馨"},
        {index:"3", callName:"卢桃", calledName:"雯馨"}
    ];
    new Vue({
       el: '#cusCallsInfo',
       data: {
           object:cusCallsD
       }
   })
    $(".callsPreTime").datetimepicker({format: 'yyyy-mm-dd hh:ii'});
    $(".callsLasTime").datetimepicker({format: 'yyyy-mm-dd hh:ii'});

</script>
</html>