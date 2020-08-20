<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<form action="${pageContext.request.contextPath}/companyInsert.do"
	      method="post">
	<div id = "ribbon">
		<div id="ribbonMap">
			홈 > 회사 > +회사정보 추가
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/companyInsertForm.do'; return false;">REFRESH</button>
			<button onclick="location.href='${pageContext.request.contextPath}/companyList.do'; return false;">LIST</button>		
			<input type="submit" value="SUBMIT" />
			<button onclick="location.href='${pageContext.request.contextPath}/companyList.do'; return false;">CANCLE</button>
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
			<tr>
				<th>회사명</th>
				<td><input type="text" name="comName" /> </td>
				<th>회사 주소</th>
				<td><input type="text" name="comAdress" /> </td>		
			</tr>
			<tr>
				<th>사업자번호</th>
				<td><input type="text" name="comRegNo" /> </td>
				<th>회사 유형</th>
				<td style="text-align: left; padding-left: 45px;" ><select name="comType">
					<option value="">회사유형 선택</option>
					<option value="0">발주</option>
					<option value="1">수주</option>
				</select></td>				
			</tr>
			<tr>
				<th>대금 결제 방식 유형</th>
				<td style="text-align: left; padding-left: 45px;" ><select name="comMethod">
					<option value="">대금 결제방식 선택</option>
					<option value="0">전신송금방식 T/T</option>
					<option value="1">기한부신용장 L/C</option>
				</select></td>
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