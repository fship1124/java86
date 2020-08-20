<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HS MES</title>
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
	<form action="${pageContext.request.contextPath}/productOrderInsert.do" method="post">
	<div id = "ribbon">
		<div id="ribbonMap">
			홈 > 생산 계획 > 생산 주문 > 등록
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/productOrderInsertForm.do'; return false;">REFRESH</button>
			<input type="submit" value="SUBMIT">
			<button onclick="location.href='${pageContext.request.contextPath}/productOrderList.do'; return false; ">CANCEL</button>
		</div>
	</div>
	<div id = "content">
				<table id="companyTable">
					<tr>
						<th>생산 주문 명</th>
						<td><input type="text" name="productOrderName"></td>
					</tr>
					<tr>
						<th>생산 공정</th>
						<td><select name="process">
								<option value="">생산공정선택</option>
								<c:forEach var="process" items="${pList}">
									<option value="${process.processId}">${process.processName}</option>
								</c:forEach>
						</select></td>
					</tr>

					<tr>
						<th>고객 주문</th>
						<td><select name="customerOrder">
								<option value="">고객주문선택</option>
								<c:forEach var="customerOrder" items="${cList}">
									<option value="${customerOrder.customerOrderId}">${customerOrder.customerOrderName}</option>
								</c:forEach>
						</select></td>
					</tr>
					<tr>
						<th>제품 수량</th>
						<td><input type="text" name="quantity"></td>
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