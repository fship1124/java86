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
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/notice_list.css' type='text/css' />

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
			홈 > 공지사항
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/noticeList.do'">REFRESH</button>
			<button onclick="location.href='${pageContext.request.contextPath}/noticeInsertForm.do'">+NEW</button>
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
			<tr>
				<th class="no">번호</th>
				<th class="writer">작성자</th>
				<th class="title">공지사항</th>
				<th class="regDate">작성일시</th>
				<th class="viewCnt">조회수</th>
			</tr>
		<c:if test="${empty noticeList}">
			<tr>
			   <td colspan='5'>공지사항이 존재하지 않습니다.</td>
			</tr>
		</c:if>
		<c:forEach var="notice" items="${noticeList}">
			<tr>
				<td class="no"><c:out value="${notice.noticeId}" /></td>
				<td class="writer"><c:out value="${notice.writer}" /></td>
				<td id="title" class="title">
				<a href='${pageContext.request.contextPath}/noticeDetail.do?noticeId=<c:out value="${notice.noticeId}" />'><c:out value="${notice.title}" /></a> 
				[${notice.replyCnt}]				
				</td>
				<td class="regDate"><fmt:formatDate value="${notice.regDate}" pattern="yyyy-MM-dd hh:mm:ss" /></td>
				<td class="viewCnt"><c:out value="${notice.viewCnt}" /></td>
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