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
    .callsT{
        visibility: hidden;
    }
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

        <div class="cusCalls">
            <div class="inputCallsSearch">
                <div>自定义时间</div>

                <span>自</span><input size="16" type="text" value="请输入时间" readonly class="callsPreTime">
                <span>至</span><input size="16" type="text" value="请输入时间" readonly class="callsLasTime">

                <button class="btn btnCallsSearch">搜索</button>

            </div>
            <table id="cusCallsInfo" class="callsT table table-hover"  >
                <tr>
                    <th>序号</th><th>主叫用户</th><th>被叫用户</th><th>开始时间</th><th>结束时间</th>
                </tr>
                <tr v-for="(object,index) in object">
                    <td>{{index+1}}</td>
                    <td>{{object.calling}}</td>
                    <td>{{object.called}}</td>
                    <td>{{object.startTime}}</td>
                    <td>{{object.endTime}}</td>
                </tr>
            </table>
        </div>

    </div>
</div>
</body>
<script>
    $(".btnCallsSearch").click(function(){
        var callingPhone=15527185211;
        var start_time=$(".callsPreTime").val();
        var end_time=$(".callsLasTime").val();
        var url="<%=path%>/api/call/list";
        var data={
            callingPhone:callingPhone,
            startTime:start_time,
            endTime:end_time
        };
        $.ajax({
            type: 'POST',
            url: url,
            data: data,
            success: function(result){
                var resultD=result;
                $(".callsT").css("visibility","visible");
                setCallTable(resultD.data);
            },
        });
    });

    function setCallTable(callsD){
        var cusCallsD=callsD;
        new Vue({
            el: '#cusCallsInfo',
            data: {
                object:cusCallsD
            }
        })
    }

    $(".callsPreTime").datetimepicker({format: 'yyyy-mm-dd hh:ii'});
    $(".callsLasTime").datetimepicker({format: 'yyyy-mm-dd hh:ii'});

</script>
</html>