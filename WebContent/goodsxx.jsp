<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link type="text/css" rel="stylesheet" href="static/css/goodsxx.css" />
<title>Insert title here</title>
</head>
<body>
	<h2>商品详情</h2>
	<form action="${pageContext.request.contextPath}/goods" method="get">
		<input type="hidden" name="action" value="update" />
		<table id="outer">
			<tr class="a">
				<td class="b">编号</td>
				<td class="b"><input type="text" value="${goods.gid}" name="gid" readonly="readonly"></td>
			</tr>
			<tr class="a">
				<td class="b">商品类别</td>
				<td class="b"><input type="text" value="${goods.gtid}" name="gtid"></td>
			</tr>
			<tr class="a">
				<td class="b">商品名称</td>
				<td class="b"><input type="text" value="${goods.gname}" name="gname"></td>
			</tr>
			<tr class="a">
				<td class="b">出厂日期</td>
				<td class="b"><input type="date" value="${goods.gpug}" name="gdate" ></td>
			</tr>
			<tr class="a">
				<td class="b">图片</td>
				<%-- <td class="b"><img src="${goods.gpicture}" name="gpicture"></td> --%>
			</tr>
			<tr class="a">
				<td class="b">单价</td>
				<td class="b"><input type="text" value="${goods.gprice}" name="gprice"></td>
			</tr>
			<tr class="a">
				<td class="b">评分</td>
				<td class="b"><input type="text" value="${goods.gstar}" name="gstar"></td>
			</tr>
			<tr class="a">
				<td class="b">备注</td>
				<td class="b"> <input type="text" value="${goods.ginfo}" name="ginfo"></td>
			</tr>
			<tr class="a" >
				<td cospan="2" class="b"><input type="submit" value="提交"></td>
			</tr>
		</table>


	</form>
</body>
</html>