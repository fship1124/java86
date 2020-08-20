<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/main.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/header.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/navibar.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/ribbon_list.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/footer.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/write_detail_table.css' type='text/css' />

</head>
<body>
	<div id = "header">
		<%@ include file='../include/header.jspf' %>
	</div>
	
	<div id = "navibar">
		<%@ include file='../include/navibar.jspf' %>
	</div>
	
<div id = "container">
	<div id = "ribbon">
		<div id="ribbonMap">
			홈 > 회사 > 세부정보
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/companyDetail.do?comId=${company.comId}'"; return false;>REFRESH</button>
			<button onclick="location.href='${pageContext.request.contextPath}/companyUpdateForm.do?comId=${company.comId}'"; return false;>MOD</button>		
			<button onclick="location.href='${pageContext.request.contextPath}/companyDelete.do?comId=${company.comId}'"; return false;>DEL</button>		
			<button onclick="location.href='${pageContext.request.contextPath}/companyList.do'"; return false;>LIST</button>		
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
			<tr>
				<th>회사명</th>
				<td><c:out value="${company.comName}"></c:out></td>
				<th>회사 주소</th>
				<td><c:out value="${company.comAdress}"></c:out></td>		
			</tr>
			<tr>
				<th>사업자번호</th>
				<td><c:out value="${company.comRegNo}"></c:out></td>
				<th>회사 유형</th>
				<td><c:out value="${company.comTypeName}"></c:out></td>				
			</tr>
			<tr>
				<th>대금 결제 방식 유형</th>
				<td><c:out value="${company.paymentName}"></c:out></td>
			</tr>
		</table>
	
	</div>
	</form>
	
</div>
	<div id = "footer">
		<%@ include file='../include/footer.jspf' %>
	</div>


</body>
</html>