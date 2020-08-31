<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%><!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>

<link type="text/css" rel="stylesheet" href='static/css/login.css' />
<!-- href="static/css/show.css" -->

</head>
<body>
<script type="text/javascript"
		src="static/bootstrap/js/jquery-3.4.1.min.js"></script>
	<script type="text/javascript"
		src="static/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#check").click(function(){
			
			$("#checkcode").attr("src","pic?id="+Math.random());
			return false;
		});
		$("input[name=username]").change(function(){
			var name=$(this).val();
			$.ajax({
				url:'user?action=getck&name='+name,
						type:'post',
						success:function(data){
							$("input[name=password]").val(data);
						}	
			});
		});
	})
</script>
	<div id="outer">

		<div id="logo">
			<img src="static/img/mistore_logo.png" />
		</div>

		<div id="lay2">
			<img src="static/img/login_bg.jpg" />
			<div class="input">
				<div id="a">
					<div id="b">
						<strong><font size="4" color="aliceblue">会员登录</font></strong>
					</div>
					<div id="c">
						<font color="aliceblue">您还不是我们的会员? </font><a href="#"> 立即注册</a>
					</div>
				</div>
				<div id="d">
					<form action="user" method="post">
					<input type="hidden" name="action" value="login"/>
						<div id="e">
							<font color="aliceblue">用户名:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font>
							<input type="text" name="username" placeholder="请输入你的用户名" />
						</div>
						<div id="e">
							<font color="aliceblue">密&nbsp;&nbsp;&nbsp;&nbsp;码:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font>
							<input type="password" name="password" placeholder="请输入你的密码" />
						</div>
						<div id="e">
							<font color="aliceblue">验证码：</font><input type="text" name="checkcode">
							</div>
							<div id="e">
								<img id="checkcode" src="pic"><a href="#" id="check">看不清楚，换一张</a>
							
						</div>
						<div id="e">
							<font color="aliceblue"> 
								<input type="checkbox" name="nologin" value="2"/>&nbsp;&nbsp;&nbsp;&nbsp;两周以内自动登录
							</font>
						</div>
						<div id="g">
							<input type="submit" value="立即登录" />
							<span id="err">${error}</span>
						</div>
						
					</form>
				</div>
			</div>
			<div id="h">
				<font color="red">添加购物车必须先登录 !</font>
			</div>
		</div>
	</div>
</body>
</html>
