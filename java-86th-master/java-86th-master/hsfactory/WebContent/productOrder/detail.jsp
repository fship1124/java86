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
		<%@ include file='../include/header.jspf' %>
	</div>
	
	<div id = "navibar">
		<%@ include file='../include/navibar.jspf' %>
	</div>
<div id = "container">
	<div id = "ribbon">
		<div id="ribbonMap">
			홈 > 생산 계획 > 생산 주문 > 세부 정보
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/productOrderDetail.do?no=${productOrder.productionOrderId}'; return false;">REFRESH</button>
			<button onclick="location.href='${pageContext.request.contextPath}/productOrderUpdate.do?no=${productOrder.productionOrderId}&step=approval'; return false;">승인</button>		
			<button onclick="location.href='${pageContext.request.contextPath}/productOrderList.do'; return false;">LIST</button>
			<c:choose>
				<c:when test="${productOrder.status == '2'}">
					<button onclick="location.href='${pageContext.request.contextPath}/productOrderUpdate.do?no=${productOrder.productionOrderId}&step=starting'">                                    
						시작
					</button>
				</c:when>
				<c:when test="${productOrder.status == '3'}">
					<button onclick="location.href='${pageContext.request.contextPath}/productOrderUpdate.do?no=${productOrder.productionOrderId}&step=complete&processId=${productOrder.processId}'">
						완료
					</button>	
				</c:when>
				<c:otherwise>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
	<div id = "content">
		<table id="companyTable">
			<tr>
				<th>생산 주문 번호</th>
				<td><c:out value="${productOrder.productionOrderId}" /></td>
			</tr>
			<tr>
				<th>생산 주문 명</th>
				<td><c:out value="${productOrder.productionOrderName}" /></td>
			</tr>
			<tr>
				<th>제품 명</th>
				<td><c:out value="${productOrder.materialName}" /></td>
			</tr>
			<tr>
				<th>제품 수량</th>
				<td><c:out value="${productOrder.materialQuantity}" /></td>
			</tr>
			<tr>
				<th>회사 명</th>
				<td><c:out value="${productOrder.companyName}" /></td>
			</tr>
			<tr>
				<th>작업자</th>
				<td><c:out value="${productOrder.worker}" /></td>
			</tr>
			<tr>
				<th>관리자</th>
				<td><c:out value="${productOrder.administrator}" /></td>
			</tr>
			<tr>
				<th>마감 일자</th>
				<td><fmt:formatDate value="${productOrder.customerOrderDeadline}" pattern="yyyy-MM-dd"/></td>
			</tr>
			<tr>
				<th>등록 일자</th>
				<td><fmt:formatDate value="${productOrder.productionOrderRegDate}" pattern="yyyy-MM-dd"/></td>
			</tr>
			<tr>
				<th>완료 일자</th>
				<td><fmt:formatDate value="${productOrder.productionOrderCompleteDate}" pattern="yyyy-MM-dd" /></td>
			</tr>
		</table>
	</div>
</div>
	<div id = "footer">
		<%@ include file='/include/footer.jspf' %>
	</div>
</body>
</html>