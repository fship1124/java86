<%@page import="VO.AccountVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/main.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/header.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/navibar.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/ribbon_list.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/footer.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/write_detail_table.css' type='text/css' />
</head>
<body>
	<div id = "header">
		<%@ include file='/include/header.jspf' %>
	</div>
	
	<div id = "navibar">
		<%@ include file='/include/navibar.jspf' %>
	</div>
	
<div id = "container">
	<div id = "ribbon">
		<div id="ribbonMap">
			홈 > 생산 계획 > 생산 주문 > 세부 정보
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/rawMaterialOrderDetail.do?no=${rawMaterialOrder.rawMaterialOrderId}'; return false;">REFRESH</button>
			<button onclick="location.href='${pageContext.request.contextPath}/rawMaterialOrderUpdate.do?no=${rawMaterialOrder.rawMaterialOrderId}&step=approval'; return false;">승인</button>		
			<button onclick="location.href='${pageContext.request.contextPath}/rawMaterialOrderList.do'; return false;">LIST</button>
			<c:choose>
				<c:when test="${rawMaterialOrder.status == '2'}">
					<button onclick="location.href='${pageContext.request.contextPath}/rawMaterialOrderUpdate.do?no=${rawMaterialOrder.rawMaterialOrderId}&step=warehousing&materialId=${rawMaterialOrder.materialId}&rawMaterialQuantity=${rawMaterialOrder.rawMaterialQuantity}'">                                    
						입고
					</button>
				</c:when>
				<c:when test="${rawMaterialOrder.status == '3'}">
					<button onclick="location.href='${pageContext.request.contextPath}/rawMaterialOrderUpdate.do?no=${rawMaterialOrder.rawMaterialOrderId}'">완료</button>	
				</c:when>
			</c:choose>
		</div>
	</div>
	
	<div id = "content">
		<input type="hidden" name="materialId" value="${rawMaterialOrder.materialId}">
		<table id="companyTable">
			<tr>
				<th>원재료 구매 주문 번호</th>
				<td><c:out value="${rawMaterialOrder.rawMaterialOrderId}" /></td>
			</tr>
			<tr>
				<th>원재료 구입 주문 명</th>
				<td><c:out value="${rawMaterialOrder.rawMaterialOrderName}" /></td>
			</tr>
			<tr>
				<th>회사 명</th>
				<td><c:out value="${rawMaterialOrder.companyName}" /></td>
			</tr>
			<tr>
				<th>제품 명</th>
				<td><c:out value="${rawMaterialOrder.materialName}" /></td>
			</tr>
			<tr>
				<th>제품 수량</th>
				<td><c:out value="${rawMaterialOrder.rawMaterialQuantity}" /></td>
			</tr>
			
			<tr>
				<th>작업자</th>
				<td><c:out value="${rawMaterialOrder.worker}" /></td>
			</tr>
			
			<tr>
				<th>관리자</th>
				<td><c:out value="${rawMaterialOrder.administrator}" /></td>
			</tr>
			
			<tr>
				<th>등록 날짜</th>
				<td><fmt:formatDate value="${rawMaterialOrder.rawMaterialOrderRegDate}" pattern="yyyy-MM-dd"/></td>
			</tr>
			
			<tr>
				<th>입고 날짜</th>
				<td><fmt:formatDate value="${rawMaterialOrder.rawMaterialWarehousingDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
			</tr>
		</table>
	</div>
</div>
	<div id = "footer">
		<%@ include file='/include/footer.jspf' %>
	</div>
</body>
</html>