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
			홈 > 제품
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/materialList.do'">REFRESH</button>		
			<button onclick="location.href='${pageContext.request.contextPath}/materialInsertForm.do'">+NEW</button>		
		</div>
	</div>
	
	<div id = "content">
			<table  id="companyTable">
				<tr>
					<th id="mtrId" onclick="sortTable('mtrId')">제품 ID</th>				
					<th id="mtrName" onclick="sortTable('mtrName')">제품 명</th>				
					<th id="mtrType">자재 유형</th>				
					<th id="mtrCost" onclick="sortTable('mtrCost')">단가</th>				
					<th id="mtrUnit">단위</th>				
					<th id="mtrRegDate">등록 날짜</th>				
					<th id="mtrUpdate">정보 변경</th>				
					<th id="mtrDelete">해당항목 삭제</th>				
				</tr>
				<c:forEach items="${pdList}" var="product">
				<tr>
					<td><c:out value="${product.mtrId}"/></td>
					<td><c:out value="${product.mtrName}"/></td>
					<td><c:out value="${product.mtrTypeName}"/></td>
					<td><c:out value="${product.mtrCost}"/></td>
					<td><c:out value="${product.mtrUnit}"/></td>
					<td><fmt:formatDate value="${product.mtrRegDate}" pattern="yyyy-MM-dd HH:mm:ss" var="matDate"/>
						<c:out value="${matDate}" />
					</td>
					<td><a href="${pageContext.request.contextPath}/materialUpdateForm.do?mtrId=${product.mtrId}">정보변경</a></td>
					<td><a href="${pageContext.request.contextPath}/materialDelete.do?mtrId=${product.mtrId}">항목삭제</a></td>
				</tr>
				</c:forEach>
			</table>
	
	</div>
	
</div>
	<div id = "footer">
		<%@ include file='../include/footer.jspf' %>
	</div>

<script>
function sortTable(orderColId) {
	
	setTimeout (function() {
		location.href = "http://localhost:9000/hsfactory/materialList.do?orderColId=" + orderColId;
		}, 1000);
	
}
</script>

</body>
</html>