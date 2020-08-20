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
<form name="inventoryInsert" action="${pageContext.request.contextPath}/midMaterialInventoryInsert.do" method="post">
	<div id = "ribbon">
		<div id="ribbonMap">
			홈 > 재고관리 > 중간재재고 > 등록
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/midMaterialInventoryInsertForm.do'; return false;">REFRESH</button>
			<button onclick="location.href='${pageContext.request.contextPath}/midMaterialInventoryList.do'; return false;">BACK</button>
			<input type="submit" value="SUBMIT" />
			<input type="reset" value="RESET" />
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
			<tr>
				<th>창고명</th>
				<td>
				<select name="" onChange="javascript:fn_changeSelected(this, 'warehouseId');">
				<option selected value="" >-선택하세요-
				<c:forEach var="warehouse" items="${warehouseList}">
					<option value="${warehouse.warehouseId}">${warehouse.warehouseName}</option>
				</c:forEach>
				</select>
				</td>				
				<th>창고번호</th>
				<td>
				<input type="text" id="warehouseId" name="warehouseId" readonly required>
				</td>
			</tr>
			<tr>
				<th>제품명</th>
				<td>
				<select name="" onChange="javascript:fn_changeSelected2(this, 'materialId', 'materialType');">
				<option selected value="" >-선택하세요-
				<c:forEach var="material" items="${materialList}">
					<option value="${material.materialId}">${material.materialName}</option>
				</c:forEach>
				</select>
				</td>				
				<th>제품번호</th>
				<td>
				<input type="text" id="materialId" name="materialId" readonly required>
				</td>
			</tr>
			<tr>
				<th>제품수량</th>
				<td>
				<input type="number" id="materialQuantity" name="materialQuantity" min="0" max="" required>
				</td>	
				<th></th>
				<td></td>	
			</tr>
			

		
		</table>
	</div>
</form>
</div>
		
	<div id = "footer">
		<%@ include file='/include/footer.jspf' %>
	</div>
<script>
	function fn_changeSelected(obj, sub) {
		var getObj = obj[obj.selectedIndex].value;
		document.getElementById(sub).value = getObj;
	}
	
	function fn_changeSelected2(obj, sub1, sub2) {
		var getObj = obj[obj.selectedIndex].value;
		var getObj2 = obj[obj.selectedIndex].getAttribute("type-data");
		alert(getObj2);
		console.log(getObj2);
		document.getElementById(sub1).value = getObj;
		document.getElementById(sub2).value = getObj2;
	}
</script>
</body>
</html>