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
			홈 > 재고관리 > 중간재재고 > 수정
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/oriMaterialInventoryList.do'; return false;">REFRESH</button>
			<button onclick="location.href='${pageContext.request.contextPath}/midMaterialInventoryList.do'; return false;">CANCEL</button>
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
			<c:choose>
				<c:when test="${inventory.inventoryId == updateInventoryId}">
					<form action="${pageContext.request.contextPath}/midMaterialInventoryUpdate.do">
					<input type="hidden" name="inventoryId" value="${inventory.inventoryId}" /> 
					<td><c:out value="${inventory.inventoryId}" /></td>
					<td><c:out value="${inventory.materialName}" /></td>
					<td><c:out value="${inventory.codeName}" /></td>
					<td>
					<input type="number" name="materialQuantity" style="width: 100px;" min="0" value="${inventory.materialQuantity}" required />${inventory.materialUnit}
					</td>
					<td><c:out value="${inventory.materialCost}원" /></td>
					<td><c:out value="${inventory.materialCost * inventory.materialQuantity}원" /></td>
					<td>
					<select name="warehouseId">
						<c:forEach var="warehouse" items="${warehouseList}">
							<c:choose>
								<c:when test="${inventory.warehouseName == warehouse.warehouseName}">
									<option selected value="${warehouse.warehouseId}">${warehouse.warehouseName}</option>
								</c:when>
								<c:otherwise>
									<option value="${warehouse.warehouseId}">${warehouse.warehouseName}</option>
								</c:otherwise>
							</c:choose>
						</c:forEach>
					</select>
					</td>
					<td><input type="submit" value="변경"/><input type="reset" value="재작성"/><input type="button" value="취소" onclick="location.href='${pageContext.request.contextPath}/midMaterialInventoryList.do'; return false;"/></td>
					<td><a href="${pageContext.request.contextPath}/midMaterialInventoryDelete.do?inventoryId=${inventory.inventoryId}">항목삭제</a></td>
					</form>
				</c:when>
				<c:otherwise>
					<td><c:out value="${inventory.inventoryId}" /></td>
					<td><c:out value="${inventory.materialName}" /></td>
					<td><c:out value="${inventory.codeName}" /></td>
					<td><c:out value="${inventory.materialQuantity}${inventory.materialUnit}" /></td>
					<td><c:out value="${inventory.materialCost}원" /></td>
					<td><c:out value="${inventory.materialCost * inventory.materialQuantity}원" /></td>
					<td><c:out value="${inventory.warehouseName}" /></td>
					<td><a href="${pageContext.request.contextPath}/midMaterialInventoryUpdateForm.do?updateInventoryId=${inventory.inventoryId}">정보변경</a></td>
					<td><a href="${pageContext.request.contextPath}/midMaterialInventoryDelete.do?deleteInventoryId=${inventory.inventoryId}">항목삭제</a></td>
				</c:otherwise>
			</c:choose>
			
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