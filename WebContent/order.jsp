<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="static/css/order.css">
</head>
<body>
	<div id="Outer">
		<!--第一层-->
		<div id="lay1">
			<div class="lay1_1">小米商城|小米商城移动版|问题反馈</div>

			<div class="lay1_2">购物车</div>

			<div class="lay1_3">登录|注册|消息通知</div>
		</div>
		<!--第二层-->
		<div id="lay2">
			<div class="lay2_1">
				<img src="static/img/logo_top.png">
			</div>
			<div class="lay2_1">
				<img src="static/img/peijian3.jpg">
			</div>
			<div class="lay2_2">
				<a href="cart.jsp"><img src="static/img/search.png"></a>
			</div>
			<div class="lay2_3">
				<input style="width: 280px" type="text" name="search"
					placeholder="搜索内容" />
			</div>
		</div>
		<div id="lay3">
			<div class="lay3_1">
				<div class="lay3_1_1">订单预览</div>
				<div class="lay3_1_2">温馨提示：请添加你要邮寄的地址</div>
			</div>

			<div class="lay3_2">
				<div class="lay3_2_1">
					<div class="lay3_a">序号</div>
					<div class="lay3_a">商品名称</div>
					<div class="lay3_a">价格</div>
					<div class="lay3_a">数量</div>
					<div class="lay3_a">小计</div>
				</div>
				<div class="lay3_2_2">收货地址</div>
				<div class="lay3_2_3">
					<input type="text" style="width: 400px">
				</div>
				<div class="lay3_2_4">添加收货地址</div>
			</div>
			<div class="lay3_3">
				<div class="lay3_3_1">商品总金额：￥0</div>
				<div class="lay3_3_2">提交订单</div>
			</div>
		</div>

	</div>

</body>
</html>