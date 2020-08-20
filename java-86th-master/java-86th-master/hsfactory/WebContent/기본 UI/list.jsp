<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>견본</title>

<link rel='stylesheet' href='${pageContext.request.contextPath}/css/main.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/header.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/navibar.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/ribbon_list.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/footer.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/list_table.css' type='text/css' />

</head>
<body>

<div id = "header">
	<%@ include file='/include/header.jspf' %>
</div>
	
<div id = "navibar">
	<%@ include file='/include/navibar.jspf' %>
</div>

<div id = "container">
	<div id = "ribbon">
		<div id="ribbonMap">
			홈 > 견본
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/accountList.do'">REFRESH</button>
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
			<tr>
				<th>번호</th>
				<th>회사명</th>
				<th>사업자번호</th>
				<th>회사 유형</th>
				<th>대금결제방식</th>
				<th>회사주소</th>													
				<th>등록날짜</th>
			</tr>
			<tr>
				<td>번호</td>
				<td>회사명</td>
				<td>사업자번호</td>
				<td>회사 유형</td>
				<td>대금결제방식</td>
				<td>회사주소</td>													
				<td>등록날짜</td>
			</tr>
			<tr>
				<td>번호</td>
				<td>회사명</td>
				<td>사업자번호</td>
				<td>회사 유형</td>
				<td>대금결제방식</td>
				<td>회사주소</td>													
				<td>등록날짜</td>
			</tr>
			<tr>
				<td>번호</td>
				<td>회사명</td>
				<td>사업자번호</td>
				<td>회사 유형</td>
				<td>대금결제방식</td>
				<td>회사주소</td>													
				<td>등록날짜</td>
			</tr>
			<tr>
				<td>번호</td>
				<td>회사명</td>
				<td>사업자번호</td>
				<td>회사 유형</td>
				<td>대금결제방식</td>
				<td>회사주소</td>													
				<td>등록날짜</td>
			</tr>
			<tr>
				<td>번호</td>
				<td>회사명</td>
				<td>사업자번호</td>
				<td>회사 유형</td>
				<td>대금결제방식</td>
				<td>회사주소</td>													
				<td>등록날짜</td>
			</tr>
		</table>
	</div>	
	
</div>

<div id = "footer">
	<%@ include file='/include/footer.jspf' %>
</div>


</body>
</html>