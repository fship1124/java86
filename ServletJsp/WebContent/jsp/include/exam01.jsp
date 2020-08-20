<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>one.jsp 페이지 포함하기</h1>
	<hr>
	<%-- 소스코드를 가져와 합치는 방식 --%>
	<%@ include file="one.jsp" %>
	<hr>
	<h2>게시판 목록 처리</h2>
	<a href="exam02.jsp">상세 페이지 이동</a>
	<%@ include file="bottom.jsp" %>
</body>
</html>






