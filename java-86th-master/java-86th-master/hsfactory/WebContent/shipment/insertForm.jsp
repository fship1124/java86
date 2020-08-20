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
<form name="shipmentInsert" action="${pageContext.request.contextPath}/shipmentInsert.do" method="post">
	<div id = "ribbon">
		<div id="ribbonMap">
			홈 > 출하관리 > 출하이력 > 등록
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/shipmentInsertForm.do'; return false; ">REFRESH</button>
			<input type="submit" value="SUBMIT" />
			<input type="reset" value="RESET" />
			<button onclick="location.href='${pageContext.request.contextPath}/shipmentList.do'; return false;">CANCEL</button>
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
			<tr>
				<th>완제품창고번호</th>
				<td>
				<input type="text" id="cWarehouseId" name="cWarehouseId" readonly required>
				</td>
				<th>완제품창고</th>
				<td>
				<select name="" onChange="javascript:fn_changeSelected(this, 'cWarehouseId');">
				<option selected value="" >-선택하세요-
				<c:forEach var="cwarehouse" items="${cwarehouseList}">
					<option value="${cwarehouse.warehouseId}">${cwarehouse.warehouseName}</option>
				</c:forEach>
				</select>
				</td>				
			</tr>
			<tr>
				<th>제품번호</th>
				<td>
				<input type="text" id="materialId" name="materialId" readonly required>
				</td>
				<th>제품명</th>
				<td>
				<select name="" onChange="javascript:fn_changeSelected(this, 'materialId');">
				<option selected name="" >-선택하세요-
				<c:forEach var="material" items="${materialList}">
					<option value="${material.materialId}">${material.materialName}</option>
				</c:forEach>
				</select>
				</td>				
			</tr>
			<tr>
				<th>물류창고</th>
				<td>
				<input type="hidden" id="lWarehouseId" name="lWarehouseId" readonly required>
				<select name="" onChange="javascript:fn_changeSelected(this, 'lWarehouseId');">
				<option selected name="" >-선택하세요-
				<c:forEach var="lwarehouse" items="${lwarehouseList}">
					<option value="${lwarehouse.warehouseId}">${lwarehouse.warehouseName}</option>
				</c:forEach>
				</select>
				</td>
				<th>제품수량</th>
				<td>
				<input type="number" id="materialQuantity" name="materialQuantity" min="0" max="" required>
				</td>			
			</tr>
			<tr>
				<th>발주회사번호</th>
				<td>
				<input type="text" name="companyId" id="companyId" readonly required>
				</td>
				<th>발주회사</th>
				<td>
				<select name="" onChange="javascript:fn_changeSelected(this, 'companyId');">
				<option selected value="" >-선택하세요-
				<c:forEach var="company" items="${companyList}">
					<option value="${company.companyId}">${company.companyName}</option>
				</c:forEach>
				</select>
				</td>				
			</tr>
			<tr>
				<th>선적일자</th>
				<td><fieldset style="width: 250">
					<legend>날짜 입력</legend>
					<input type="date" id="datePicker" min="2015-08-01" max="2016-12-12" name="shipmentRegDate" required>				
				</fieldset></td>
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
	
	document.getElementById('datePicker').valueAsDate = new Date();
</script>
</body>
</html>