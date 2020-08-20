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
	<%-- 소스코드를 가져와 합치는 방식 
		파라미터 처리가 불가능하다.
		one.jsp?id=aaa 오류
		
		변수를 같이 공유해서 사용할 수 있다.
	--%>
	<%
		String msg = "테스트중...";
	%>
	<%@ include file="one.jsp" %>
	<hr>
	<h2>게시판 상세 처리</h2>
	<%@ include file="bottom.jsp" %>
</body>
</html>






