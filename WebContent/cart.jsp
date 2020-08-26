<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
<style type="text/css">
.showNum {
	cursor: pointer;
}
</style>
<link type="text/css" rel="stylesheet" href="static/css/default.css" />
<!-- href="static/css/show.css" -->
</head>

<body>
	<script type="text/javascript">
	window.onload=function(){
		cartNum=document.getElementById("cartNum");
	}
	function showAdd(uid,gid){
		var xhr=new XMLHttpRequest();
		xhr.open("get","cart?action=updateAdd&uid="+uid+"&gid="+gid);
		xhr.send();
		xhr.onreadystatechange=function(){
			if(xhr.readyState==4&&xhr.status==200){
				var res=xhr.responseText;
				cartNum.innerHTML=res; 
		}
	}
	}
	
	</script>
	<div id="outer">

		<div id="lay1">
			<div class="a">
				<a>小米商城│</a>
			</div>
			<div class="a">
				<a>小米商城移动版│</a>
			</div>
			<div class="a">
				<a>问题反馈</a>
			</div>
			<div class="c">
				<a>购物车</a>
			</div>
			<div class="b">
				<a>消息通知</a>
			</div>
			<div class="b">
				<a>注册│</a>
			</div>
			<div class="b">
				<a>登录 |</a>
			</div>
		</div>

		<div id="lay2">
			<div class="x">
				<div class="a">
					<img src="static/img/login.png" />
				</div>
				<div class="b">
					<img src="static/img/search.png" />
				</div>
				<div class="b">
					<input />
				</div>
			</div>
			<div class="c">
				<div class="d">我的购物车</div>
				<div class="e">温馨提示:产品是否购买成功，以最终下单为准哦，请尽快结算</div>
				<div class="f">
					<table>
						<tr>
							<td>照片</td>
							<td>商品名称</td>
							<td>商品数量</td>
							<td>商品价格</td>

						</tr>
						<c:forEach items="${items}" var="cart">
							<tr>
								<td><a href="goods?action=selectOne&id=${cart.goods.gid}"><img
										width="100px" height="200px" src="${cart.goods.gpicture}"></a></td>
								<td>${cart.goods.gname}</td>
								<td><span
									onclick="showSub(${sessionScope.user.uid},${cart.goods.gid})"
									class="showNum">-</span> <span id="cartNum">${cart.num}</span>
									<span
									onclick="showAdd(${sessionScope.user.uid},${cart.goods.gid})"
									class="showNum">+</span></td>
								<td>${cart.goods.gprice}</td>

							</tr>
						</c:forEach>

					</table>
				</div>
				<div class="line"></div>
				<div class="g">
					<input type="submit" value="清空购物车" />
				</div>
				<div class="h">
					<input type="submit" value="添加收货地址" />
				</div>
				<div class="i">商品金额总计:&nbsp;&nbsp;&nbsp;¥</div>
			</div>
		</div>

		<div id="lay3">
			<div class="a">小米商城[MIUI米聊)多看书城小米路由器j视频电话小米天猫店小米淘宝直营店|小米网盟|小米移动|[隐私政策[Select
				Region</div>
			<div class="a">@mi.com京ICP证110507号京ICP备10046444号京公网安备11010802020134号京网文[2014]0059-0009号</div>
			<div class="a">违法和不良信息举报电话:185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</div>
		</div>
	</div>
</body>
</html>
