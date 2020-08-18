<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="static/css/goodsDetail.css" />
</head>
<body>
	<script type="text/javascript">
		function changeImg(x) {
			x.parentNode.parentNode.children[0].children[0].src = x.src;

		}
	</script>
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
		<!--第三层-->
		<div id="lay3">&nbsp;&nbsp;小米商城&nbsp;&nbsp;/&nbsp;&nbsp;手机&nbsp;&nbsp;/&nbsp;&nbsp;手机</div>
		<!-- 第四层 -->
		<div id="lay4">
			<div class="lay4_1">
				<div class="a">
					<img src="${goods.gpicture}">
				</div>
				<div class="b">
					<img src="${goods.gpic1}" onmouseover="changeImg(this)" />
				</div>
				<div class="b">
					<img src="${goods.gpic2}" onmouseover="changeImg(this)" />
				</div>
				<div class="b">
					<img src="${goods.gpic3}" onmouseover="changeImg(this)" />
				</div>
				<div class="b">
					<img src="${goods.gpic4}" onmouseover="changeImg(this)" />
				</div>
			</div>
			<div class="lay4_2">
				<div class="lay4_2_1">商品详情</div>
				<div class="lay4_2_2">
					<font size="4px">产品名称：${goods.gname}</font><br> <br>市场价格：￥${goods.gprice}<br>上市时间：<f:formatDate value="${goods.gdate}" pattern="yyyy-MM-dd"/><br>热销指数：${goods.gstar}
					<br>详细介绍：${goods.ginfo} <br>颜色：${goods.phyanse}<br>处理器：${goods.phchuliqi}<br>内存：${goods.phneicun}<br>版本：${goods.pnbanben}
				</div>
				<div class="lay4_2_3">
					<div class="lay4_2_3_1" onclick="addCart(${goods.gid})">加入购物车</div>
					<script type="text/javascript">
					function addCart(id){
						var xhr=new XMLHttpRequest();//创建对象
						xhr.open("get", "cart?action=add&id="+id);//
						xhr.send();//发送请求
						xhr.onreadystatechange=function(){
							if(xhr.readyState==4&&xhr.status==200){
								
							}
						}
					}
					
					</script>
					<div class="lay4_2_3_2">直接购买</div>
				</div>
			</div>
		</div>
		<!--第五层-->
		<div id="lay5">
			小米商城|MIUI|米聊|多看书城|小米路由器|视频电话|小米天猫店|小米淘宝直营店|小米网盟|小米移动|隐私政策|Select
			Region<br>@mi.com 京|CP证110570号ICP备10046444号 京公网安备11010802020134号
			京网文[2014]0059-0009号<br>违法和不良信息举报电话：185-0130-1238,本网站所列数据，除特殊说明，所有数据均出自我司实验室测试
		</div>
	</div>
</body>
</html>