<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/list_table.css' type='text/css' />

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
			홈 > 창고
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/warehouseList.do'">REFRESH</button>		
			<button onclick="location.href='${pageContext.request.contextPath}/warehouseInsertForm.do'">+NEW</button>		
		</div>
	</div>
	
	<div id = "content">
			<table id = "companyTable">
				<tr>
					<th id="wHouseId" onclick="sortTable('wHouseId', '${order}' )" >창고 Id</th>				
					<th id="wHouseName">창고 명</th>				
					<th id="wHouseTypeName">창고 유형</th>				
					<th id="inventoryAlgorismName">재고 관리</th>				
					<th id="factoryIdName">공장 이름</th>				
					<th id="wHouseRegDate">등록 날짜</th>
					<th id="whsUpdate">정보 변경</th>				
					<th id="whsDelete">해당항목 삭제</th>					
				</tr>
				<c:forEach items="${whList}" var="warehouse">
				<tr>
					<td><c:out value="${warehouse.wHouseId}"/></td>
					<td><c:out value="${warehouse.wHouseName}"/></td>
					<td><c:out value="${warehouse.wHouseTypeName}"/></td>
					<td><c:out value="${warehouse.inventoryAlgorismName}"/></td>
					<td><c:out value="${warehouse.factoryIdName}"/></td>
					<td><fmt:formatDate value="${warehouse.wHouseRegDate}" pattern="yyyy-MM-dd HH:mm:ss" var="whsDate"/>
						<c:out value="${whsDate}" />
<%-- 					<td><a href="${pageContext.request.contextPath}/warehouseUpdateForm.do?wHouseId=${warehouse.wHouseId}">정보변경</a></td> --%>
					<td><a href="#">정보변경</a></td>
					<td><a href="${pageContext.request.contextPath}/warehouseDelete.do?wHouseId=${warehouse.wHouseId}">항목삭제</a></td>	
					</td>
				</tr>
				</c:forEach>
			</table>
	</div>
	
</div>
	<div id = "footer">
		<%@ include file='../include/footer.jspf' %>
	</div>

<script type="text/javascript">


function sortTable(orderColId, order) {
	
	var order
	if ( order == 0 ) {
		order = 1;
		location.href = 
			"http://localhost:9000/hsfactory/warehouseList.do?orderColId=" + orderColId + "&order=" + order;
	}
	
}
</script>

</body>
</html>