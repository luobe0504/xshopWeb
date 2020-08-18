<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<link type="text/css" rel="stylesheet" href="static/css/register.css" />
	</head>
	<body bgcolor="#14212A">
		<div id="outer">
			<div id="lay1">
				<div class="a">注册会员</div>
				<div class="b">小米商城</div>
			</div>
			<form action="#" method="post">
				<div id="lay2">
					<div class="c">用户名<input type="text" name="username" value="Username"></div>
				</div>
				<div id="lay3">
					<div class="c">密码<input type="password" name="password" value="Password"></div>
				</div>
				<div id="lay3">
					<div class="c">确认密码<input type="password" name="passwordagain" value="Password Again"></div>
				</div>
				<div id="lay3">
					<div class="c">邮箱<input type="email" name="email" value="Email"></div>
				</div>
				<div id="lay4">
					<div class="x">性别</div>
					<div class="y"><input type="radio" name="denger"></div>
					<div class="z">男</div>
					<div class="y"><input type="radio" name="denger"></div>
					<div class="y">女</div>
				</div>
				<hr>
				<div id="lay5">
				<div class="h"><input type="submit" name="submit" value="注册"></div>
				<div class="i"><input type="reset" name="reset" value="重置"></div>
				</div>
			</form>
		</div>
	</body>
</html>
