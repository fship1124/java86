<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HS MES</title>
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/main.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/header.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/navibar.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/ribbon_list.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/footer.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/list_table.css' type='text/css' />
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
			홈 > 출하관리 > 출하이력 > 리스트
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/shipmentList.do'">REFRESH</button>
			<button onclick="location.href='${pageContext.request.contextPath}/shipmentInsertForm.do'">+NEW</button>
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
			<tr>
				<th>출하번호</th>
				<th>제품번호</th>
				<th>제품명</th>
				<th>제품수량</th>
				<th>제품단가</th>
				<th>총비용</th>
				<th>완제품창고</th>
				<th>물류창고</th>
				<th>회사명</th>			
				<th>출하일자</th>	
				<th>상세정보</th>	
			</tr>
			<c:forEach var="shipment" items="${shipmentList}">
				<tr>
				<td><c:out value="${shipment.shipmentId}" /></td>
				<td><c:out value="${shipment.materialId}" /></td>
				<td><c:out value="${shipment.materialName}" /></td>
				<td><c:out value="${shipment.materialQuantity}${shipment.materialUnit}" /></td>
				<td><c:out value="${shipment.materialCost}원" /></td>
				<td><c:out value="${shipment.materialQuantity * shipment.materialCost}원" /></td>
				<td><c:out value="${shipment.cpWarehouseName}" /></td>
				<td><c:out value="${shipment.logisticWarehouseName}" /></td>				
				<td><c:out value="${shipment.companyName}" /></td>				
				<td><fmt:formatDate value="${shipment.shipmentRegDate}" pattern="yyyy-MM-dd" /></td>
				<td><a href="${pageContext.request.contextPath}/shipmentDetail.do?shipmentId=${shipment.shipmentId}">상세보기</a></td>							
				</tr>
			</c:forEach>
		</table>
	</div>
</div>
	
	<div id = "footer">
		<%@ include file='/include/footer.jspf' %>
	</div>



</body>
</html>