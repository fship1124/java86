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
				홈 > 회사조직 > 생산 공정 > 리스트
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/processList.do'">REFRESH</button>
			<button onclick="location.href='${pageContext.request.contextPath}/processInsertForm.do'">+NEW</button>
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
			<tr>
				<th>번호</th>
				<th>생산공정명</th>
				<th>제품 명</th>
				<th>제품 수량</th>
				<th>등록 날짜</th>
			</tr>
			
			<c:forEach var="process" items="${list}">
				<tr>
					<td><c:out value="${process.processId}" /></td>
					<td><c:out value="${process.processName}" /></td>
					<td><c:out value="${process.materialName}" /></td>
					<td><c:out value="${process.materialQuantity}" /></td>
					<td><fmt:formatDate value="${process.processRegDate}" pattern="yyyy-MM-dd" /></td>
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