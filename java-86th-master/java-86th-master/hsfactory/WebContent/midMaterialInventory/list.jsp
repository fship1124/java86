<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
			홈 > 재고관리 > 중간재재고 > 리스트
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/midMaterialInventoryList.do'; return false;">REFRESH</button>
			<button onclick="location.href='${pageContext.request.contextPath}/midMaterialInventoryInsertForm.do'; return false;">+NEW</button>
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
			<tr>
				<th>재고번호</th>
				<th>제품명</th>
				<th>제품유형</th>
				<th>제품수량</th>
				<th>제품단가</th>
				<th>재품총가격</th>
				<th>창고명</th>													
				<th>변경</th>													
				<th>항목삭제</th>													
			</tr>
			<c:forEach var="inventory" items="${inventoryList}">
			<tr>
				<td><c:out value="${inventory.inventoryId}" /></td>
				<td><c:out value="${inventory.materialName}" /></td>
				<td><c:out value="${inventory.codeName}" /></td>
				<td><c:out value="${inventory.materialQuantity}${inventory.materialUnit}" /></td>
				<td><c:out value="${inventory.materialCost}원" /></td>
				<td><c:out value="${inventory.materialCost * inventory.materialQuantity}원" /></td>
				<td><c:out value="${inventory.warehouseName}" /></td>
				<td><a href="${pageContext.request.contextPath}/midMaterialInventoryUpdateForm.do?updateInventoryId=${inventory.inventoryId}">정보변경</a></td>
				<td><a class="delTag" href="#" type-data="${inventory.inventoryId}">항목삭제</a></td>
			</tr>
			</c:forEach>
		</table>
	</div>
</div>
	
	<div id = "footer">
		<%@ include file='/include/footer.jspf' %>
	</div>

<script>
	$(".delTag").click(function () {
		if (confirm("삭제하시겠습니까?")) {
			location.href="${pageContext.request.contextPath}/midMaterialInventoryDelete.do?deleteInventoryId=" + $(this).attr("type-data");
		};
	});
</script>

</body>
</html>