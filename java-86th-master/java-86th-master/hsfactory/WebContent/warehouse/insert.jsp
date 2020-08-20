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
	<form action="${pageContext.request.contextPath}/warehouseInsert.do"
	      method="post">
	<div id = "ribbon">
		<div id="ribbonMap">
			홈 > 창고 관리 > 창고 > 창고정보 추가
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/warehouseInsertForm.do'; return false;">REFRESH</button>
			<button onclick="location.href='${pageContext.request.contextPath}/warehouseList.do'; return false;">LIST</button>		
			<input type="submit" value="INSERT" />
			<button onclick="location.href='${pageContext.request.contextPath}/warehouseList.do'; return false;">CANCLE</button>		
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
			<tr>
				<th>창고명</th>
				<td><input type="text" name="wHouseName" /> </td>
				<th>창고 유형</th>
				<td style="text-align: left; padding-left: 45px;" ><select name="wHouseType" >
						<option value="">창고유형 선택</option>
						<option value="1">1: 원자재 창고</option>
						<option value="2">2: 부자재 창고</option>
						<option value="3">3: 완제품 창고</option>
						<option value="4">4: 물류 창고</option>
					</select>
				</td>	
			</tr>
				<tr>
				<th>재고 관리 시스템 유형</th>
				<td style="text-align: left; padding-left: 45px;" ><select name="inventoryAlgorism">
						<option value="">재고관리 유형 선택</option>
						<option value="0">0: FIFO</option>
						<option value="1">1: LIFO</option>
					</select>
				</td>
				<th>공장 번호</th>
				<td style="text-align: left; padding-left: 45px;" ><select name="factoryId">
					<option value="" >공장 선택</option>
					<option value="1" >1: 수원 테이블 공장</option>
					<option value="2" >2: 용인 조명 공장</option>
				</select>
				</td>	
			</tr>
		</table>
	
	</div>
	</form>
	
	<div id = "footer">
		<%@ include file='../include/footer.jspf' %>
	</div>
</div>


</body>
</html>