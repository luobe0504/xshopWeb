<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>管理员登录页面</title>
</head>
<body>

	<form action="${pageContext.request.contextPath}/manager" method="post">
		<input type="hidden" name="action" value="login" />
		
		<table border="1px" align="center">
			<tr align="center">
				<td>用户名</td>
				<td colspan="2"><input type="text" name="username"></td>
			</tr>

			<tr align="center">
				<td>密码</td>
				<td colspan="2"><input type="password" name="password"></td>
			</tr>
			
			<tr>
				<td>验证码</td>
				<td><input type="text" name="inputCode"></td>
				<td><img src="code?action=getCode"></td>
			</tr>
			
			<tr align="center">
				<td colspan="3"><input type="submit" value="登录"></td>
			</tr>
			
		</table>
	</form>

</body>
</html>