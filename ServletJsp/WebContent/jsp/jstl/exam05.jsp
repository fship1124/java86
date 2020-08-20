<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%
	List<String> list = new ArrayList<String>();
	list.add("one");
	list.add("two");
	list.add("three");
	list.add("four" );
	pageContext.setAttribute("list", list);
%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<hr>
	<%--
		for (int i = 1; i <= 9; i++ ) ...
		
		step 은 default로 1이 설정됨
	 --%>
	<c:forEach var="i" begin="1" end="9" step="1">
		<c:out value="${i}" /><br> 
	</c:forEach>
	
	생년월일 : 
	<select>
		<c:forEach var="i" begin="1990" end="2016">
			<option value="<c:out value="${i}" />"><c:out value="${i}" /></option>
		</c:forEach>
	</select>
	<hr>
	<c:set var="cnt" value="1" />
	<c:forEach var="data" items="${list}">
		<c:if test="${cnt != 1}">,</c:if>
		<c:out value="${data}" />
		<c:set var="cnt" value="${cnt + 1}" />
	</c:forEach>
	<hr>
	
	<c:forEach var="data" items="${list}" varStatus="loop">
		${loop.first}:::${loop.last}:::${loop.index}:::${loop.count}<br>
	</c:forEach>

	<c:forEach var="data" items="${list}" varStatus="loop">
		<c:if test="${!loop.first}">,</c:if>
		<c:out value="${data}" />
	</c:forEach>
</body>
</html>











