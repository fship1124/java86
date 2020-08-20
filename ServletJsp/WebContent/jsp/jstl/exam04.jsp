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
	<c:set var="type" value="S" />
	<c:choose>
		<c:when test="${type == 'S'}">
			<h2>관리자 입니다.</h2>
		</c:when>	
		<c:when test="${type == 'U'}">
			<h2>사용자 입니다.</h2>
		</c:when>	
		<c:otherwise>
			<h2>회원이 아닙니다.</h2>
		</c:otherwise>	
	</c:choose>
</body>
</html>












