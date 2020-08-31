<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="com.be.pojo.Goods"%>
<%@ page errorPage="error.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="static/css/index.css" />
</head>
<body>
	<script type="text/javascript" src="static/js/index.js"></script>
	<div id="mc" onmouseover="clearInterval(T)"
		onmouseout="T=setInterval('ff()',10);">
		<div class="circle" onmouseover="showImg(1)">1</div>
		<div class="circle" onmouseover="showImg(2)">2</div>
		<div class="circle" onmouseover="showImg(3)">3</div>
		<div class="circle" onmouseover="showImg(4)">4</div>
	</div>
	<div id="menu">
		<c:forEach items="${gtlist}" var="goodstype">
			<div class="items" onmouseover="showItems(1,${goodstype.gtid})" onmouseout="showItems(2)">${goodstype.gtname}</div>
		</c:forEach>
	</div >
	<div id="showItem" onmouseover="this.style.display='block'"><!--  onmouseout="this.style.display='none'" -->
	
	</div>
	<div id="show_outer">
		<div id="show_lay1">
			<div class="a">
				<img src="static/img/logo_top.png">
			</div>
			<div class="a">
				<img src="static/img/peijian3.jpg">
			</div>
			<div class="a b">
				<input type="text" name="search" placeholder="搜索内容" />
			</div>
			<div class="a c">
				<a href="goods?action=selectLike&search=${ }"><img src="static/img/search.png"></a>
			</div>
		</div>
		<div id="show_lay2">
			<!-- <img src="static/img/banner2.jpg" />-->
			<div id="show_lay2_inner">
				<div class="pic">
					<img src="static/img/banner2.jpg" />
				</div>
				<div class="pic">
					<img src="static/img/nice1.jpg" />
				</div>
				<div class="pic">
					<img src="static/img/nice2.jpg" />
				</div>
				<div class="pic">
					<img src="static/img/nice3.jpg" />
				</div>
			</div>

		</div>
		<div id="show_lay3">
			<div class="a">
				<div class="pic">
					<img src="static/img/hjh_01.gif" />
				</div>
				<div class="pic">
					<img src="static/img/hjh_02.gif" />
				</div>
				<div class="pic">
					<img src="static/img/hjh_03.gif" />
				</div>
				<div class="pic">
					<img src="static/img/hjh_04.gif" />
				</div>
				<div class="pic">
					<img src="static/img/hjh_05.gif" />
				</div>
				<div class="pic">
					<img src="static/img/hjh_06.gif" />
				</div>
			</div>
			<div class="a">
				<img src="static/img/hongmi4x.png" />
			</div>
			<div class="a">
				<img src="static/img/xiaomi5.jpg" />
			</div>
			<div class="a">
				<img src="static/img/pinghengche.jpg" />
			</div>
		</div>
		<div id="show_font">
			小米明星产品|<a href="goods?action=selectPage">分页展示</a>
		</div>
		<div id="show_lay4">

			<c:forEach var="goods" items="${glist}">
				<div class="a">
					<div class="pic a1">
						<a href="goods?action=selectOne&id=${goods.gid}"><img
							src="${goods.gpicture }" /></a>
					</div>
					<div class="brand">${goods.gname }<%-- |<a href="goods?action=selectOne&id=${goods.gid}">修改</a>|<a href="goods?action=delete&id=${goods.gid}">删除</a>|<a href="goods?action=selectOne">添加</a> --%>
					</div>
					<div class="info">${goods.ginfo}</div>
					<div class="price">￥${goods.gprice}</div>
				</div>
			</c:forEach>

			<%--
			List<Goods> loader = (List<Goods>) request.getAttribute("loader");
			
			for (Goods goods : loader) {
			<div class="a">
				<div class="pic a1"><img src="<%=goods.getPimage()%>" /></div>
				<div class="brand"><%=goods.getPname()%></div>
				<div class="info"><%=goods.getPinfo()%></div>
				<div class="price">￥<%=goods.getPprice()%></div>
			</div>
			
				}
			--%>

		</div>
	</div>
</body>
</html>