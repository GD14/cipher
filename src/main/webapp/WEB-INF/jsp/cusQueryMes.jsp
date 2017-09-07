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
<style>


</style>
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

        <div class="cusMes">
            <div class="inputMesSearch">
                <div>自定义时间</div>

                <span>自</span><input size="16" type="text" value="" readonly class="MesPreTime">
                <span>至</span><input size="16" type="text" value="" readonly class="MesLasTime">

                <button class="btn btnMesSearch">搜索</button>

            </div>
            <table id="cusMesInfo" class="table table-hover"  >
                <tr>
                    <th>序号</th><th>发送用户</th><th>接收用户</th>
                </tr>
                <tr v-for="(object,index) in object">
                    <td>{{index+1}}</td>
                    <td>{{object.sendName}}</td>
                    <td>{{object.receiveName}}</td>
                </tr>
            </table>
        </div>

    </div>
</div>
</body>
<script>
    var cusMesD=[
        {index:"1", sendName:"卢桃", receiveName:"雯馨"},
        {index:"2", sendName:"卢桃", receiveName:"雯馨"},
        {index:"3", sendName:"卢桃", receiveName:"雯馨"}
    ];
    new Vue({
        el: '#cusMesInfo',
        data: {
            object:cusMesD
        }
    })
    $(".MesPreTime").datetimepicker({format: 'yyyy-mm-dd hh:ii'});
    $(".MesLasTime").datetimepicker({format: 'yyyy-mm-dd hh:ii'});
</script>
</html>