<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시글 등록</title>
</head>
<body>
	<div class="container">
		<div class="header">
			<%@ include file="/WEB-INF/jsp/include/topMenu.jsp" %>
		</div>
		
		<div class="content">
			<hr />
			<h2>자바 네트워크 게시판</h2>
			<hr />
			<br><br>
			<hr />
			번호 : <c:out value="${board.no}"></c:out><br> 
			글쓴이 : <c:out value="${board.writer}"></c:out><br> 
			내용 : <c:out value="${board.content}"></c:out><br> 
			등록일시 : <fmt:formatDate value="${board.regDate}" pattern="yyyy-MM-dd HH:mm:ss" var="regDate" /><br>
			
			첨부파일 : <a href="${pageContext.request.contextPath}/down?path=${board.filePath}&realName=${board.realFileName}&oriName=${board.oriFileName}"></a>
			<hr />
			<a href="updateForm.do?no=${board.no}" >수정</a>
			<a href="delete.do?no=${board.no}" >삭제</a>
			<a href="list.do" >목록</a>
		</div>
		
		<div class="footer">
			<%@ include file="/WEB-INF/jsp/include/bottom.jsp" %>
		</div>
	</div>
</body>
</html>