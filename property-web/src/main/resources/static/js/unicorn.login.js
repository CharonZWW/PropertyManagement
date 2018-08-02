$(document).ready(function(){

	var login = $('#loginform');
	var recover = $('#recoverform');
	var form = $('#loginbox');
	var speed = 400;
	
	/**
	 * 登录按钮的ajax响应
	 */
	$("#loginButton").click(
		function(){
			$.ajax({
				type:"post",
				url:"../../login",
				dataType:"json",
				data:{
					name:$("#username").val(),
					pass:$("#password").val(),
					verCode:$("#verCode").val()
				},
				success:function(data){
					var re = data.result;
					if(re == 0){
						$("#login-prompt").html("验证码输入错误");
					}else if(re == 1 ){
						$("#login-prompt").html("用户名不存在");
					}else if(re == 2){
						$("#login-prompt").html("密码错误");
						
					}else if(re == 3){
						$("#login-prompt").html("登录成功！");
						if(data.role == 1){
							$(location).attr("href","homepage.html");
						}else if(data.role == 2){
							$(location).attr("href","../teacher/admitStudent.html");
						}
					}
				}
			})
		}
	);
	
	/**
	 * 验证码点击更换
	 */
	var pic = document.getElementById("verPic");
	function getPic(){
		//通过url传参不同刷新请求
		pic.src = "../../PictureCheckCodeServlet?a=" + Math.random();	
	}
	
	getPic();
	
	$('#verPic').click(
			function(){
				getPic();
			}
	);

	/**
	 * “还未注册”点击事件
	 */
	$('#to-recover').click(function(){
		login.fadeTo(speed,0.01).css({'z-index':'100'});
		recover.fadeTo(speed,1).css({'z-index':'200'});
		form.css('height','260');
	});
	
	/**
	 * “返回登录”点击事件
	 */
	$('#to-login').click(function(){
		recover.fadeTo(speed,0.01).css('z-index','100');
		login.fadeTo(speed,1).css('z-index','200');
		form.css('height','260');
	});
    
    /**
     * 输入框默认值的效果
     */
    if($.browser.msie == true && $.browser.version.slice(0,3) < 10) {
        $('input[placeholder]').each(function(){ 
       
        var input = $(this);       
       
        $(input).val(input.attr('placeholder'));
               
        $(input).focus(function(){
             if (input.val() == input.attr('placeholder')) {
                 input.val('');
             }
        });
       
        $(input).blur(function(){
            if (input.val() == '' || input.val() == input.attr('placeholder')) {
                input.val(input.attr('placeholder'));
            }
        });
    });

    
        
    }
});