<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	// 날짜 객체를 원하는 문자열 형식으로 변환
	String sDate = sdf.format(new Date());
	// 문자열을 날짜 객체로 변환
	Date dataObj = sdf.parse("2016-07-11");
	// 년도
	int year = dataObj.getYear() + 1900;
--%>
<fmt:parseDate var="date" value="2016-07-11" pattern="yyyy-MM-dd" />
날짜 정보 : 년 - <c:out value="${date.year + 1900}" /><br>
날짜 문자열 : <fmt:formatDate value="${date}" pattern="yyyy-MM-dd" />
</body>
</html>













