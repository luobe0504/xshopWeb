<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link type="text/css" rel="stylesheet" href="static/css/a.css" />
<title>Insert title here</title>
</head>
<body>
<form action="goods">
<input type="hidden" name="action" value="selectLike"> 
<div class="a b">
				<input type="text" name="search" placeholder="搜索内容" />
			</div>
			<div class="a c">
				<input type="image" src="static/img/search.png">
			</div>
			</form>
	<table id="outer">
		<tr class="a">
			<td class="b">编号</td>
			<td class="b">类型</td>
			<td class="b">商品名称</td>
			<td class="b">出厂日期</td>
			<td class="b">图片</td>
			<td class="b">价格</td>
			<td class="b">评分</td>
			<td class="b">备注</td>
		</tr>
		<c:forEach items="${requestScope.plist}" var="goods">
			<tr class="a">
				<td class="b">${goods.gid}</td>
				<td class="b">${goods.gtname}<%-- <select name="goodstype">
				<c:forEach items="${requestScope.clist}" var="cl" >
				<option value="${cl.gtid}">${cl.gtname}</option>
				
				</c:forEach></select> --%></td>
				<td class="b">${goods.gname}</td>
				<td class="b"><f:formatDate value="${goods.gdate}" pattern="yyyy-MM-dd"/></td>
				<td class="b"><a href="goods?action=selectOne&id=${goods.gid}"><img width="80" height="100" src="${goods.gpicture}"></a></td>
				<td class="b">${goods.gprice}</td>
				<td class="b">${goods.gstar}</td>
				<td class="b">${goods.ginfo}</td>
			</tr>
		</c:forEach>


		<tr>
			<th cospan="8"><c:choose>
					<c:when test="${pb.mpage<3}">

						<c:forEach begin="1" step="1" end="${pb.mpage}" var="p">
							<c:if test="${pb.page==p}"> ${p}|</c:if>
							<c:if test="${pb.page!=p}">
								<a href="goodstype?action=selectcidLike&page=${p}&id=${id}"> ${p}|</a>
							</c:if>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<c:choose>
							<c:when test="${pb.page==1}">
								<c:forEach begin="1" step="1" end="3" var="p">
									<c:if test="${pb.page==p}"> ${p}|</c:if>
									<c:if test="${pb.page!=p}">
										<a href="goodstype?action=selectcidLike&page=${p}&id=${id}"> ${p}|</a>
									</c:if>
								</c:forEach>
							</c:when>
							<c:when test="${pb.page==pb.mpage}">
								<c:forEach begin="${pb.mpage-2}" step="1" end="${pb.mpage}" var="p">
									<c:if test="${pb.page==p}"> ${p}|</c:if>
									<c:if test="${pb.page!=p}">
										<a href="goodstype?action=selectcidLike&page=${p}&id=${id}"> ${p}|</a>
									</c:if>
								</c:forEach>
							</c:when>
							<c:otherwise>
								<c:forEach begin="${pb.page-1}" step="1" end="${pb.page+1}"
									var="p">
									<c:if test="${pb.page==p}"> ${p}|</c:if>
									<c:if test="${pb.page!=p}">
										<a href="goodstype?action=selectcidLike&page=${p}&id=${id}"> ${p}|</a>
									</c:if>
								</c:forEach>
							</c:otherwise>
						</c:choose>
					</c:otherwise>
				</c:choose></th>
		</tr>

	</table>
	<%-- <div>
		<a href="goods?action=selectLike&page=1&search=${search}">首页</a>|
		<c:choose>
			<c:when test="${pb.page-1>=1}">
				<a href="goods?action=selectLike&page=${pb.page-1}&search=${search}">上页</a>|</c:when>
			<c:otherwise>上页|</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${pb.page+1<=pb.mpage}">
				<a href="goods?action=selectLike&page=${pb.page+1}&search=${search}">下页</a>|</c:when>
			<c:otherwise>下页|</c:otherwise>
		</c:choose>
		<a href="goods?action=selectLike&page=${pb.mpage}&search=${search}">尾页</a>| 当前第
		${pb.page} 页 |共${pb.mpage}页|每页显示${pb.rows}条  </div>--%>

		<%-- <a href="User?action=selectPage&page=1">首页</a>|
		<c:if test="${pb.page-1>=1}">
			<a href="User?action=selectPage&page=${pb.page-1}">上页</a>| </c:if>
		<c:if test="${pb.page-1<1}"> 上页| </c:if>
		<c:if test="${pb.page+1<=pb.mpage}">
			<a href="User?action=selectPage&page=${pb.page+1}">下页</a>|</c:if>
		<c:if test="${pb.page+1>pb.mpage}">下页|</c:if>
		<a href="User?action=selectPage&page=${pb.mpage}">尾页</a>| 当前第
		${pb.page} 页 |共${pb.mpage}页|每页显示${pb.rows}条 --%>
	
</body>
</html>