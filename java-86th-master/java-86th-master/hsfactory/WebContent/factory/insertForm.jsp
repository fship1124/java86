<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<form action="${pageContext.request.contextPath}/factoryInsert.do" method="post">
	<div id = "ribbon">
		<div id="ribbonMap">
			홈 > 회사조직 > 공장 > 등록
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/factoryInsertForm.do'; return false;">REFRESH</button>
			<input type="submit" value="확인">
			<input type="reset" value="재작성">
			<button onclick="location.href='${pageContext.request.contextPath}/factoryList.do'; return false; ">CANCEL</button>
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
			<tr>
				<th>공장명</th>
				<td><input type="text" name="factoryName" required /> </td>
				<th>공장주소</th>
				<td><input type="text" name="factoryAdress" required /></td>				
			</tr>
			<tr>
				<th>등록 일자</th>
				<td>
				<fieldset style="width: 250">
					<legend>날짜 입력</legend>
					<input type="date" name="factoryRegDate" id="datePicker" min="2015-08-01" max="2016-12-12" name="day" required />
				</fieldset></td>
			</tr>
		</table>
	</div>
</form>
</div>
	
	<div id = "footer">
		<%@ include file='/include/footer.jspf' %>
	</div>
<script>

	function fn_changeSelected(obj, sub) {
		var getObj = obj[obj.selectedIndex].value;
		document.getElementById(sub).value = getObj;
	}
	
	document.getElementById('datePicker').valueAsDate = new Date();
	
</script>
</body>
</html>