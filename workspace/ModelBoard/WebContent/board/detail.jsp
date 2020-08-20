<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath}/js/jquery-3.1.0.js"></script>
</head>
<body>
	<div id="content">
		<hr>
		<h2>자유 게시판</h2>
		<hr>
		글번호 : <input type="text" value=<c:out value="${board.no}"/> /><br>
		글제목 : <input type="text" value=<c:out value="${board.title}" />/><br>
		글쓴이 : <input type="text" value=<c:out value="${board.writer}" />/><br>
		내용 : <textarea type="text" value=<c:out value="${board.content}" />></textarea><br>
		등록일시 : <fmt:formatDate value="${board.reDate}" pattern="yyyy-MM-dd" var="reDate" /><br>
		첨부파일 : <input type="text" value=<c:out value="${board.content}" />/><br>
		
	</div>
</body>
</html>