$('#login').click(
    function () {
        $.ajax({
            method : "post",
            url : "../house/login",
            dataType : "json",
            data : {
                m_username : $('#username').val(),
                m_password : $('#password').val()
            },
            success : function (data) {
                 if (data){
                     alert("登陆成功！");
                 } else {
                     alert("账户或密码不正确!");
                 }
            }
        })
    }
)