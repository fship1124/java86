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
<form name="shipmentUpdate" action="${pageContext.request.contextPath}/shipmentUpdate.do" method="post">
	<div id = "ribbon">
		<div id="ribbonMap">
			홈 > 출하관리 > 출하이력 > 수정
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/shipmentUpdateForm.do?shipmentId=${shipment.shipmentId}'; return false; ">REFRESH</button>
			<button onclick="location.href='${pageContext.request.contextPath}/shipmentList.do'; return false; ">LIST</button>
			<input type="submit" value="MOD" />
			<input type="reset" value="RESET" />
			<button onclick="location.href='${pageContext.request.contextPath}/shipmentDetail.do?shipmentId=${shipment.shipmentId}'; return false; ">CANCEL</button>
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
			<tr>
				<th>완제품창고번호</th>
				<td>
				<input type="hidden" value="${shipment.shipmentId}" id="shipmentId" name="shipmentId" readonly required>
				<input type="text" value="${shipment.cpWarehouseId}" id="cWarehouseId" name="cWarehouseId" readonly required>
				</td>
				<th>완제품창고</th>
				<td>
				<select name="" onChange="javascript:fn_changeSelected(this, 'cWarehouseId');">
				<c:forEach var="cwarehouse" items="${cwarehouseList}">
				<c:choose>
					<c:when test="${cwarehouse.warehouseName == shipment.cpWarehouseName}">
						<option selected value="${cwarehouse.warehouseId}">${cwarehouse.warehouseName}</option>
					</c:when>
					<c:otherwise>
							<option value="${cwarehouse.warehouseId}">${cwarehouse.warehouseName}</option>
					</c:otherwise>
				</c:choose>
				</c:forEach>
					</select>
				</td>				
			</tr>
			<tr>
				<th>제품번호</th>
				<td>
				<input type="text" value="${shipment.materialId}" id="materialId" name="materialId" readonly required>
				</td>
				<th>제품명</th>
				<td>
				<select name="" onChange="javascript:fn_changeSelected(this, 'materialId');">
				<c:forEach var="material" items="${materialList}">
				<c:choose>
				<c:when test="${material.materialName == shipment.materialName}">
					<option selected value="${material.materialId}">${material.materialName}</option>
				</c:when>
				<c:otherwise>
					<option value="${material.materialId}">${material.materialName}</option>
				</c:otherwise>
				</c:choose>
				</c:forEach>
				</select>
				</td>				
			</tr>
			<tr>
				<th>물류창고</th>
				<td>
				<input type="hidden" id="lWarehouseId" value="${shipment.logisticWarehouseId}" name="lWarehouseId" readonly required>
				<select name="" onChange="javascript:fn_changeSelected(this, 'lWarehouseId');">
				<c:forEach var="lwarehouse" items="${lwarehouseList}">
					<c:choose>
				<c:when test="${lwarehouse.warehouseName == shipment.logisticWarehouseName}">
					<option selected value="${lwarehouse.warehouseId}">${lwarehouse.warehouseName}</option>
				</c:when>
				<c:otherwise>
					<option value="${lwarehouse.warehouseId}">${lwarehouse.warehouseName}</option>
				</c:otherwise>
				</c:choose>
				</c:forEach>
				</select>
				</td>
				<th>제품수량</th>
				<td>
				<input type="number" value="${shipment.materialQuantity}" id="materialQuantity" name="materialQuantity" min="0" max="" required>
				<input type="hidden" value="${shipment.materialQuantity}" id="oriQuantity" name="oriQuantity">
				</td>			
			</tr>
			<tr>
				<th>발주회사번호</th>
				<td>
				<input type="text" value="${shipment.companyId}" name="companyId" id="companyId" readonly required>
				</td>
				<th>발주회사</th>
				<td>
				<select name="" onChange="javascript:fn_changeSelected(this, 'companyId');">
				<c:forEach var="company" items="${companyList}">
				<c:choose>
				<c:when test="${company.companyName == shipment.companyName}">
					<option selected value="${company.companyId}">${company.companyName}</option>
				</c:when>
				<c:otherwise>
					<option value="${company.companyId}">${company.companyName}</option>
				</c:otherwise>
				</c:choose>
				</c:forEach>
				</select>
				</td>				
			</tr>
			<tr>
				<th>출하일자</th>
				<td>
				<fmt:formatDate var="shipmentRegDate" value="${shipment.shipmentRegDate}" pattern="yyyy-MM-dd" />
				<fieldset style="width: 250">
				<legend>날짜 입력</legend>
				<input type="date" value="${shipmentRegDate}" min="2015-08-01" max="2016-12-12" name="shipmentRegDate" required>				
				</fieldset>
				</td>
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
</script>

</body>
</html>