<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>자유 게시판</title>
</head>
<body>
	<div class="container">
		<div class="header">
			<%@ include file="/WEB-INF/jsp/include/topMenu.jsp" %>
		</div>
		
		<div class="content">
			<h3>자유 게시판</h3>
			<hr>
			전체 게시글 : ${fn:length(list)}개<br>
			<table width="80%" boarder="1px" >
				<tr>
					<th>글번호</th>
					<th>글제목</th>
					<th>글쓴이</th>
					<th>등록일</th>
				</tr>
				<c:forEach items="${list}" var="board" >
					<tr>
						<td><c:out value="${board.no}"></c:out> </td>
						<td><c:out value="${board.title}"></c:out> </td>
						<td><c:out value="${board.writer}"></c:out> </td>
						<td><fmt:formatDate value="${board.regDate}" pattern="yyyy-MM-dd HH:mm:ss" var="regDate" /> </td>
					</tr>
				</c:forEach>
				<c:if test="${empty list}">
					<tr>
						<td colspan="4" >등록된 게시글이 존재하지 않습니다.</td>
					</tr>
				</c:if>
			</table>
		</div>
		
		<div class="footer">
			<%@ include file="/WEB-INF/jsp/include/bottom.jsp" %>
		</div>
	</div>
</body>
</html>