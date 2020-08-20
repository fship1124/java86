<%@page import="java.util.ArrayList"%>
<%@page import="jsp.Count"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%
	List<Count> list = new ArrayList<Count>();
	Count c = new Count();
	c.setMsg("연습");
	c.setNum(1);
	list.add(c);
	
	pageContext.setAttribute("list", list);
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="vo" items="${list}">
		msg : <c:out value="${vo.msg}" />
	</c:forEach>
</body>
</html>









