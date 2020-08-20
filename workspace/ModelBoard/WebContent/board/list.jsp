<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h3>자유게시판</h3>
		<h3>전체글 : ${fn:length(list)}개 </h3>
		<hr>
	</div>
	<div>
		<table>
			<tr>
				<th>글번호</th>
				<th>글제목</th>
				<th>글쓴이</th>
				<th>등록일</th>
			</tr>
			<c:forEach items="${list}"  var="board" >
			<tr>
				<td><c:out value="${board.no}"></c:out> </td>
				<td><c:out value="${board.writer}" /></td>
		  		<td><a href='detail.do?no=<c:out value="${board.no}" />'><c:out value="${board.title}" /></a></td>
		  		<td><fmt:formatDate var="regDate" value="${board.regDate}" pattern="yyyy-MM-dd" />
		      		<c:out value="${regDate}" />
		  </td>
			</tr>
			</c:forEach>
			<c:if test="${empty list}">
			<tr>
				<td colspan="4" >게시물이 존재하지 않습니다.</td>
			</tr>
			</c:if>
		</table>
		<a href='writeForm.do'>글쓰기</a>
	</div>
</body>
</html>