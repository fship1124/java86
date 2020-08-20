<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/upload/2016/08/11/Jellyfish.jpg">해파리</a>
	
	<a href="${pageContext.request.contextPath}/down?path=/2016/08/11&realName=Jellyfish.jpg&oriName=Jellyfish.jpg">다운로드</a>
	<a href="${pageContext.request.contextPath}/down?path=/2016/08/11&realName=Jellyfish.jpg&draw=Y">화면출력</a>
	<img src="${pageContext.request.contextPath}/down?path=/2016/08/11&realName=Jellyfish.jpg&draw=Y" width="150" height="100" />
	
	
</body>
</html>







