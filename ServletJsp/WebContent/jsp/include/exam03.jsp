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
	<h1>ONE 페이지 포함하기</h1>
	<hr>
	<%--
		동적으로 실행된 결과만을 참조하기 때문에
		변수의 공유가 불가능하다.
		
		파라미터 호출 가능함
	 --%>
	<c:import url="one.jsp" />
	<hr>
	<c:import url="one.jsp?msg=test" />
	<hr>
	<c:import url="one.jsp">
		<c:param name="msg">한글</c:param>
	</c:import>
</body>
</html>











