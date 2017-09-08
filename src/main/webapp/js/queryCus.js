/**
 * Created by luter on 2017-9-7-0007.
 */


$(document).ready(function(){
    var callingPhone;
    var start_time;
    var end_time;
    var url="cipher/api/call/list";
    $.ajax({
        type: 'POST',
        url: url,
        data: data,
        success: function(result){
            var resultD=result;
            if(resultD.errno=="0"){
                
            }
        },
        dataType: dataType
    });
});



