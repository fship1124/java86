<%@page import="jsp.Count"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Count c = new Count();
	c.setNum(1);
	c.setMsg("el");
	
	pageContext.setAttribute("c", c);
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
		pageContext.getRequest().getContextPath()
	 --%>
	${pageContext.request.contextPath}<br>

	num : ${c.num}<br>
	msg : ${c.msg}<br>
	msg : ${c["msg"]}<br>
	<%--
	email : ${c.email}<br>
	 --%>
</body>
</html>






