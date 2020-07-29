$(
    function(){
        var getUsersUrl='/test_war_exploded/user/query';
        show();
        function show(){
                //将数据送到后台
                $.get(getUsersUrl,null, function(data) {
                    var html="";
                    alert(data[1].name);
                    data.map(function (temp,index){
                        html+="<div>"
                             +temp.id+"<br>"
                             +temp.name+"<br>"
                             +temp.gender+"<br>"
                             +temp.createTime+"<br>"
                             +"</div>"
                             +"<div>---------</div>"
                    });
                    $('#container').html(html);
                });
        }
    }
)