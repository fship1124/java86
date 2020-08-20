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
			홈 > 사용자명단
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/accountList.do'; return false;">REFRESH</button>
			<c:if test="${authType == '관리자'}">
			<button onclick="location.href='${pageContext.request.contextPath}/accountInsertForm.do'; return false;">+NEW</button>
			</c:if>
		</div>
	</div>
	<div id = "content">
		<table id="companyTable">
			<tr>
				<th>사용자 번호</th>
				<th>사용자 ID</th>
				<c:if test="${authType == '관리자'}">
				<th>사용자 비밀번호</th>
				</c:if>
				<th>사용자 권한</th>
				<c:if test="${authType == '관리자'}">
				<th>수정</th>
				<th>삭제</th>
				</c:if>
			</tr>
			<c:forEach var="account" items="${accountList}">
				<tr>
				<td><c:out value="${account.systemAuthorityId}" /></td>
				<td><c:out value="${account.id}" /></td>
				<c:if test="${authType == '관리자'}">
				<td><c:out value="${account.password}" /></td>
				</c:if>
				<td><c:out value="${account.authority}"/></td>
				<c:if test="${authType == '관리자'}">
				<td><a href="${pageContext.request.contextPath}/accountUpdateForm.do?id=${account.id}">수정</a></td>
				<td><a href="${pageContext.request.contextPath}/accountDelete.do?systemAuthorityId=${account.systemAuthorityId}">삭제</a></td>
				</c:if>
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
			location.href="${pageContext.request.contextPath}/inventoryDelete.do?deleteInventoryId=" + $(this).attr("type-data");
		};
	});
</script>

</body>
</html>