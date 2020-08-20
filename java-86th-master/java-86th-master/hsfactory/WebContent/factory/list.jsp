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
			홈 > 회사조직 > 공장 > 리스트
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/factoryList.do'">REFRESH</button>
			<button onclick="location.href='${pageContext.request.contextPath}/factoryInsertForm.do'">+NEW</button>
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
			<tr>
				<th>공장번호</th>
				<th>공장명</th>
				<th>공장주소</th>
				<th>등록일자</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
			<c:forEach var="factory" items="${factoryList}">
			<tr>
				<td><c:out value="${factory.factoryId}" /></td>
				<td><c:out value="${factory.factoryName}" /></td>
				<td><c:out value="${factory.factoryAdress}" /></td>
				<td><fmt:formatDate value="${factory.factoryRegDate}" pattern="yyyy-MM-dd" /></td>
				<td><a href="${pageContext.request.contextPath}/factoryUpdateForm.do?factoryId=${factory.factoryId}">정보변경</a></td>
				<td><a href="#" class="delTag" type-data="${factory.factoryId}">항목삭제</a></td>
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
			location.href="${pageContext.request.contextPath}/factoryDelete.do?factoryId=" + $(this).attr("type-data");
		};
	});
</script>
</body>
</html>