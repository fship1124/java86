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
	<form action="${pageContext.request.contextPath}/materialInsert.do"
	      method="post">
	<div id = "ribbon">
		<div id="ribbonMap">
			홈 > 기준정보 > 제품 > +제품정보 추가
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/materialInsertForm.do'; return false;">REFRESH</button>
			<button onclick="location.href='${pageContext.request.contextPath}/materialList.do'; return false;">LIST</button>		
			<input type="submit" value="SUBMIT" />
			<button onclick="location.href='${pageContext.request.contextPath}/materialList.do'; return false;">CANCLE</button>		
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
			<tr>
				<th>제품 명</th>
				<td><input type="text" name="mtrName" /> </td>
				<th>자재 유형</th>
				<td style="text-align: left; padding-left: 45px;" ><select name="mtrType">
					<option value="">자재유형 선택</option>
					<option value="1">1:완제품</option>
					<option value="2">2:중간재</option>
					<option value="3">3:원자재</option>
					<option value="4">4:부자재</option>
				</select></td>	
			</tr>
			<tr>
				<th>비용</th>
				<td><input type="text" name="mtrCost" /> </td>
				<th>단위</th>
				<td style="text-align: left; padding-left: 45px;" ><select name="mtrUnit">
					<option value="">단위 선택</option>
					<option value="pcs">pcs</option>
					<option value="ml">ml</option>
					<option value="mm">mm</option>
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