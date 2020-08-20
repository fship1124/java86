<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
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
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/list_table.css' type='text/css' />

</head>
<body>
	<div id = "header">
		<%@ include file='../include/header.jspf' %>
	</div>
	
	<div id = "navibar">
		<%@ include file='../include/navibar.jspf' %>
	</div>
	
<div id = "container">
	<div id="ribbon">
		<div id="ribbonMap">
			홈 > 회사
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/companyList.do'">REFRESH</button>
			<button onclick="location.href='${pageContext.request.contextPath}/companyInsertForm.do'">+NEW</button>
		</div>
	</div>
	
	<div id = "content">
			<table  id="companyTable">
				<tr>
					<th id="comId" onclick="sortTable('comId', '${order}' )" >회사 ID</th>				
					<th id="comName" onclick="sortTable('comName')">회사 명</th>				
					<th id="comAdress">회사 주소</th>				
					<th id="comRegNo">사업자 번호</th>				
					<th id="comType">회사 유형</th>				
					<th id="comMethod">대금 결제 방식</th>				
					<th id="comDate" onclick="sortTable('tblSort', 0, 'date')">등록 날짜</th>				
				</tr>
				<tbody>
				<c:forEach items="${cpList}" var="company">
				<tr>
					<td><c:out value="${company.comId}"/></td>
					<td><a href='${pageContext.request.contextPath}/companyDetail.do?comId=<c:out value="${company.comId}"/>'><c:out value="${company.comName}"/></a></td>
					<td><c:out value="${company.comAdress}"/></td>
					<td><c:out value="${company.comRegNo}"/></td>
					<td><c:out value="${company.comTypeName}"/></td>
					<td><c:out value="${company.paymentName}"/></td>
					<td><fmt:formatDate value="${company.comDate}" pattern="yyyy-MM-dd HH:mm:ss" var="comDate"/>
						<c:out value="${comDate}" />
					</td>
				</tr>
				</c:forEach>
				</tbody>
			</table>
	</div>
	
</div>
	<div id = "footer">
		<%@ include file='../include/footer.jspf' %>
	</div>

<script type="text/javascript">


function sortTable(orderColId, order) {
	
	var order
	if ( order == 0 ) {
		order = 1;
		location.href = 
			"http://localhost:9000/hsfactory/companyList.do?orderColId=" + orderColId + "&order=" + order;
	}
	
	
	
// 	setTimeout (function() {
// 		location.href = "http://localhost:9000/hsfactory/companyList.do?orderColId=" + orderColId;
// 		}, 1000);
	
}
</script>
</body>
</html>