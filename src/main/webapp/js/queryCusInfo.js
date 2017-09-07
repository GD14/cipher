/**
 * Created by luter on 2017-9-7-0007.
 */


(function () {
    var cusInfoD={data:[{姓名:"卢桃",性别:"女",手机号码:"17607185613",身份证号:"*******************",联系地址:"武汉大学文理学籍计算机学院"}]};
    new Vue({
        el: '#cusInfo',
        data: {
            object: cusInfoD.data
        }
    })
})
