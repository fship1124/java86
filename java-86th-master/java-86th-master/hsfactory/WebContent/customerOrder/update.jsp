<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>    
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
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/write_detail_table.css' type='text/css' />

</head>
<body>
	<div id = "header">
		<%@ include file='/include/header.jspf' %>
	</div>
	
	<div id = "navibar">
		<%@ include file='/include/navibar.jspf' %>
	</div>
	
<div id = "container">
	<form action="${pageContext.request.contextPath}/customerOrderUpdate.do" method="post">
	<div id = "ribbon">
		<div id="ribbonMap">
			홈 > 생산 계획 > 고객주문 > 상세정보 수정
		</div>
		<div id="ribbonBtn">
				<button onclick="location.href='${pageContext.request.contextPath}/customerOrderUpdateForm.do?no=${CustomerOrder.customerOrderId}'; return false;">REFRESH</button>
				<button onclick="location.href='${pageContext.request.contextPath}/customerOrderList.do'; return false;">LIST</button>
				<input type="submit" value="MOD" />
				<button onclick="location.href='${pageContext.request.contextPath}/customerOrderDetail.do?no=${CustomerOrder.customerOrderId}'; return false;">CANCLE</button>
			
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
			<tr>
				<input type="hidden" name="no" value='<c:out value="${CustomerOrder.customerOrderId}" />'/>
				<th>고객 주문 번호</th>
				<td><c:out value="${CustomerOrder.customerOrderId}" /></td>
				<th>고객 주문 명</th>
				<td><input type="text" name="customerOrderName" REQUIRED ></td>
			</tr>
			<tr>
				<th>회사 명</th>
				<td><c:out value="${CustomerOrder.companyName}" /></td>
				<th>제품 명</th>
				<td><c:out value="${CustomerOrder.materialName}" /></td>
			</tr>
			<tr>
				<th>제품 수량</th>
				<td><c:out value="${CustomerOrder.materialQuantity}" /></td>
				<th>회사 유형</th>
				<td><c:out value="${CustomerOrder.codeName}" /></td>
			</tr>
			<tr>
				<th>마감 일자</th>
				<td><fmt:formatDate value="${CustomerOrder.customerOrderDeadline}" pattern="yyyy-MM-dd"/><br>
					<fmt:formatDate value="${CustomerOrder.customerOrderRegDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
			</tr>
		</table>
	</div>
	</form>
</div>
	<div id = "footer">
		<%@ include file='/include/footer.jspf' %>
	</div>
</body>
</html>