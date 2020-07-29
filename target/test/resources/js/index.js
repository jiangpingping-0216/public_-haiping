$(
    function(){
        alert("hello");
        var registerUrl='/test_war_exploded/user/register';
        Register();
        function Register(){
            $('#submit').click(function(){
                alert($('#name').val()+"---"+$('#gender').val())
                //将数据送到后台
                $.post(registerUrl, {
                    name:$('#name').val(),
                    gender:$('#gender').val()
                }, function(success) {
                    if(success){
                        window.location.href="http://localhost:8080/test_war_exploded/user/success";
                    }else{
                        window.location.href="http://localhost:8080/test_war_exploded/user/failure";
                    }
                });
            });
        }
    }
)