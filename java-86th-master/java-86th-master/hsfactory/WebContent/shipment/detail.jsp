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
			홈 > 출하관리 > 출하이력 > 상세보기
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/shipmentDetail.do?shipmentId=${shipment.shipmentId}'">REFRESH</button>
			<button onclick="location.href='${pageContext.request.contextPath}/shipmentUpdateForm.do?shipmentId=${shipment.shipmentId}'">MOD</button>
			<button class="delTag" type-data="${shipment.shipmentId}">DEL</button>
			<button onclick="location.href='${pageContext.request.contextPath}/shipmentList.do'">LIST</button>
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
		
			<tr>
				<th>출하번호</th>
				<td><c:out value="${shipment.shipmentId}" /></td>
				<th>제품번호</th>
				<td><c:out value="${shipment.materialId}" /></td>				
			</tr>
			<tr>
				<th>제품이름</th>
				<td><c:out value="${shipment.materialName}" /></td>
				<th>제품수량</th>
				<td><c:out value="${shipment.materialQuantity} ${shipment.materialUnit}" /></td>				
			</tr>
				<th>제품단가</th>
				<td><c:out value="${shipment.materialCost}원" /></td>
				<th>제품 총 비용</th>
				<td><c:out value="${shipment.materialQuantity * shipment.materialCost}원" /></td>
			<tr>
				<th>완제품창고ID</th>
				<td><c:out value="${shipment.cpWarehouseId}" /></td>
				<th>완제품창고명</th>
				<td><c:out value="${shipment.cpWarehouseName}" /></td>
			</tr>
			<tr>
				<th>물류창고ID</th>
				<td><c:out value="${shipment.logisticWarehouseId}" /></td>
				<th>물류창고명</th>
				<td><c:out value="${shipment.logisticWarehouseName}" /></td>
			</tr>
			<tr>
				<th>발주회사ID</th>
				<td><c:out value="${shipment.companyId}" /></td>
				<th>발주회사명</th>
				<td><c:out value="${shipment.companyName}" /></td>
			</tr>
			<tr>
				<th>출하일자</th>
				<td><fmt:formatDate value="${shipment.shipmentRegDate}" pattern="yyyy-MM-dd" /></td>
			</tr>
		</table>

	</div>
</div>
	
	<div id = "footer">
		<%@ include file='/include/footer.jspf' %>
	</div>

<script>
	$(".delTag").click(function () {
		if (confirm("삭제하시겠습니까?")) {
			location.href="${pageContext.request.contextPath}/shipmentDelete.do?shipmentId=" + $(this).attr("type-data");
		};
	});
</script>

</body>
</html>