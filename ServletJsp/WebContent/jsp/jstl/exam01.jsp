<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// pageContext.setAttribute("msg", "jstl");
	%>
	변수 cnt를 공유영역(page)에 설정<br>
	<%--  
		scope 생략시 page 자동 설정
		<c:set var="cnt" value="1" scope="page" />
	--%>
	<c:set var="cnt" value="1" />
	page 영역의 cnt를 출력 : ${cnt}<br>
	request 영역에 cnt를 설정하는데 page 영역의 cnt 값에 1을 더한 값을 설정<br>
	
	<c:set var="cnt" value="${cnt  + 1}" scope="request" />
	request 영역의 cnt를 출력 : ${requestScope.cnt}<br>
	
	page 영역에 설정된 cnt를 삭제<br>
	<%--
		공유 삭제시 scope 속성을 생략하면 모든 영역을 대상으로 삭제함
		<c:remove var="cnt" scope="page" />
	 --%>
	<c:remove var="cnt" />
	cnt : ${cnt}<br>
</body>
</html>
















