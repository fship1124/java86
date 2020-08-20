<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시글 수정</title>
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
		 <form action="update.do" method="post" >
		 	<input type="hidden" name="no" value="<c:out value='${board.no}'/>"/>
		 	제목 : <input type="text" name="title" = value="<c:out value='${board.title}' />" />
		 	글쓴이 : <input type="text" readonly="readonly" value="<c:out value='${board.writer}' />" />
		 	내용 : <textarea rows="10" cols="50" name="content" ><c:out value="${board.content}"/></textarea>
		 	<button type="submit" >수정</button>
		 </form>
	</div>
	<div class="footer">
		<%@ include file="/WEB-INF/jsp/include/bottom.jsp" %>
	</div>
</body>
</html>