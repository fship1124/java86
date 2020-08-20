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
	<form action="${pageContext.request.contextPath}/eachProcessInsert.do" method="post">
	<div id = "ribbon">
		<div id="ribbonMap">
			홈 > 회사조직 > 공장 > 등록
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/eachProcessInsertForm.do'; return false;">REFRESH</button>
			<input type="submit" value="SUBMIT">
			<button onclick="location.href='${pageContext.request.contextPath}/eachProcessList.do'; return false; ">CANCEL</button>
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
		<tr>
			<th>개별 주문 명</th><td><input type="text" name="eachProcessName"></td>
		</tr>	
		<tr>
			<th colspan="2">output</th>
		</tr>	
		<tr>
			<td><select name="outputMaterial">
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
		</select></td>
		<td>제품 수량<input type="text" name="outputQuantity"></td>
		</tr>
		<tr>
			<td><select name="outputMaterial">
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
		</select></td>
		<td>제품 수량<input type="text" name="outputQuantity"></td>
		</tr>
		
		<tr>
			<th colspan="2">input</th>
		</tr>	
		<tr>
			<td>
			<select name="inputMaterial">
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
			<td>제품 수량<input type="text" name="inputQuantity"></td>
		</tr>
		<tr>
			<td>
				<select name="inputMaterial">
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
			<td>제품 수량<input type="text" name="inputQuantity"></td>
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