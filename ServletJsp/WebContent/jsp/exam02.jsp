<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	화면에 현재 시간 정보를 출력한다.
	오늘은 2016-08-05 입니다.
	현재 시간은 15:47:01 입니다.
 --%>
<%
String pattern = "yyyy-MM-dd HH:mm:ss";
SimpleDateFormat sdf = new SimpleDateFormat(pattern);
String sDate = sdf.format(new Date());
String [] arr = sDate.split(" ");
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body> 
	오늘은 <%= arr[0] %> 입니다.<br>
	현재 시간은 <%= arr[1] %> 입니다.
</body>
</html>




