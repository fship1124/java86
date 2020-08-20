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
		<%@ include file='/include/header.jspf' %>
	</div>
	
	<div id = "navibar">
		<%@ include file='/include/navibar.jspf' %>
	</div>
<div id = "container">	
	<form action="${pageContext.request.contextPath}/rawMaterialOrderInsert.do" method="post">
	<div id = "ribbon">
		<div id="ribbonMap">
			홈 > 기준정보 > 제품 > +제품정보 추가
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/rawMaterialOrderInsertForm.do'; return false;">REFRESH</button>
			<button onclick="location.href='${pageContext.request.contextPath}/rawMaterialOrderList.do'; return false;">LIST</button>		
			<input type="submit" value="SUBMIT" />
			<button onclick="location.href='${pageContext.request.contextPath}/rawMaterialOrderList.do'; return false;">CANCLE</button>
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
			<tr>
				<th>원재료 구입 주문 명</th>
				<td><input type="text" name="rawMaterialOrderName"></td>
			</tr>
				<tr>
				<th>회사 번호</th>
				<td><select name="company">
		    <option value="">회사선택</option>
		    <option value="1">에이스침대</option>
		    <option value="2">이케아</option>
		    <option value="3">목재 회사</option>
		    <option value="4">못 회사</option>
		    <option value="5">니스 회사</option>
		    <option value="6">포장지 회사</option>
		</select></td>
			</tr>
			
			<tr>
				<th>제품 번호</th>
				<td><select name="material">
		    <option value="">제품선택</option>
			<option value="1">포장된 테이블</option>
			<option value="2">니스칠한 테이블</option>
			<option value="3">조립 테이블</option>
			<option value="4">테이블 원판</option>
			<option value="5">테이블 다리</option>
			<option value="6">목재</option>
			<option value="7">니스</option>
			<option value="8">못</option>
			<option value="9">포장지</option>
		</select>
		</td>
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