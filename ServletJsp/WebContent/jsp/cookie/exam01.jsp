<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>쿠키 정보</h2>
<%
	Cookie[] cArr = request.getCookies();
	if (cArr != null) {
		for (Cookie c : cArr) {
			String name  = c.getName();
			String value = URLDecoder.decode(c.getValue(), "utf-8");
%>
			<h3>이름 : <%= name %>, 값 : <%= value %></h3>
<%		
		}
	}
%>
	<h2>쿠키 설정</h2>
	<form action="/ServletJsp/jsp/cookie/exam01">
		이름 : <input type="text" name="name" /><br>
		값 : <input type="text" name="value" /><br>
		<input type="submit" value="쿠키설정" />
	</form>
</body>
</html>





