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
<style>
    .cusInfo{
        visibility: hidden;
    }
</style>
<body>
<div class="row">
    <div class="main-nav col-md-3">
        <div class="user-name text-center">${manager.managerName}</div>
        <div class="nav-ul text-center">
            <ul class="list-unstyled">
                <li>主页</li>
                <li class="nav-visiting"onclick="window.location.href='<%=path%>/query/empQuery;'">查询</li>
                <li>消息</li>
            </ul>
        </div>
    </div>
    <div class="main-query col-md-9">
        <div class="query-title">
            <p>查询</p>
            <hr/>
        </div>

        <div>
            <input class="input inputCusPh" type="text" placeholder="请输入用户手机号">
            <button class="btn btnInfoSearch">查询</button>
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
    $(".btnInfoSearch").click(function(){
        var phoneNumber=$(".inputCusPh").val();
        if( phoneNumber=="请输入用户手机号"){
            return;
        }
        var url="<%=path%>/api/message/list";
        var userType="manager";
        var managerId=${manager.managerId};
        var data={
            phoneNumber:phoneNumber,
            type:userType,
            id:managerId
        };
        $.ajax({
            type: 'POST',
            url: url,
            data: data,
            success: function(result){
                var resultD=result;
                $(".cusInfo").css("visibility","visible");
                setInfoDl(resultD.data);
            },
        });
    });
    function setInfoDl(infoD){
        var cusInfoD={
            姓名:"卢桃",
            性别:"女",
            手机号码:"17607185613",
            身份证号:"*******************",
            联系地址:"武汉大学文理学籍计算机学院",
        };
        new Vue({
            el: '#cusInfo',
            data: {
                object:cusInfoD
            }
        })
    }

</script>
</html>
