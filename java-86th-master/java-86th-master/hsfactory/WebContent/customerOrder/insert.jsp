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
	<form action="${pageContext.request.contextPath}/customerOrderInsert.do" method="post">
	<div id = "ribbon">
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/customerOrderInsertForm.do'; return false;">REFRESH</button>
			<button onclick="location.href='${pageContext.request.contextPath}/customerOrderList.do'; return false;">LIST</button>
			<input type="submit" value="SUBMIT" />
			<button onclick="location.href='${pageContext.request.contextPath}/customerOrderList.do'; return false;">CANCLE</button>
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
			<tr>
				<th>고객 주문 명</th>
				<td><input type="text" name="customerOrderName"></td>
				<th>회사</th>
				<td style="text-align: left; padding-left: 45px;" >
				<select name="company" >
					<option value="">회사선택</option>
					<option value="1">1: 에이스침대</option>
					<option value="2">2: 이케아</option>
				</select></td>
			</tr>
			<tr>
				<th>제품 번호</th>
				<td style="text-align: left; padding-left: 45px;" >
				<select name="material">
				    <option value="">제품선택</option>
					<option value="1">1: 포장된 테이블</option>
					<option value="2">2: 니스칠한 테이블</option>
					<option value="3">3: 조립 테이블</option>
					<option value="4">4: 테이블 원판</option>
					<option value="5">5: 테이블 다리</option>
					<option value="6">6: 목재</option>
					<option value="7">7: 니스</option>
					<option value="8">8: 못</option>
					<option value="9">9: 포장지</option>
				</select></td>
				<th>제품 수량</th>
				<td><input type="text" name="quantity"></td>
			</tr>
			<tr>
				<th>마감 일자</th>
				<td style="text-align: left; padding-left: 45px;" >
				<select name="year">
					<option value="">연도</option>
					<option value="2000">2000</option>
					<option value="2001">2001</option>
					<option value="2002">2002</option>
					<option value="2003">2003</option>
					<option value="2004">2004</option>
					<option value="2005">2005</option>
					<option value="2006">2006</option>
					<option value="2007">2007</option>
					<option value="2008">2008</option>
					<option value="2009">2009</option>
					<option value="2010">2010</option>
					<option value="2011">2011</option>
					<option value="2012">2012</option>
					<option value="2013">2013</option>
					<option value="2014">2014</option>
					<option value="2015">2015</option>
					<option value="2016">2016</option>
					<option value="2017">2017</option>
					<option value="2018">2018</option>
					<option value="2019">2019</option>
					<option value="2020">2020</option>
				</select>
					
				<select name="month">
					<option value="">월</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
					<option value="8">8</option>
					<option value="9">9</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
				</select>
						
				<select name="day">
					<OPTION value="">일</OPTION>
					<OPTION value="1">1</OPTION>
			        <OPTION value="2">2</OPTION>
			        <OPTION value="3">3</OPTION>
			        <OPTION value="4">4</OPTION>
			        <OPTION value="5">5</OPTION>
			        <OPTION value="6">6</OPTION>
			        <OPTION value="7">7</OPTION>
			        <OPTION value="8">8</OPTION>
			        <OPTION value="9">9</OPTION>
			        <OPTION value="10">10</OPTION>
			        <OPTION value="11">11</OPTION>
			        <OPTION value="12">12</OPTION>
			        <OPTION value="13">13</OPTION>
			        <OPTION value="14">14</OPTION>
			        <OPTION value="15">15</OPTION>
			        <OPTION value="16">16</OPTION>
			        <OPTION value="17">17</OPTION>
			        <OPTION value="18">18</OPTION>
			        <OPTION value="19">19</OPTION>
			        <OPTION value="20">20</OPTION>
			        <OPTION value="21">21</OPTION>
			        <OPTION value="22">22</OPTION>
			        <OPTION value="23">23</OPTION>
			        <OPTION value="24">24</OPTION>
			        <OPTION value="25">25</OPTION>
			        <OPTION value="26">26</OPTION>
			        <OPTION value="27">27</OPTION>
			        <OPTION value="28">28</OPTION>
			        <OPTION value="29">29</OPTION>
			        <OPTION value="30">30</OPTION>
			        <OPTION value="31">31</OPTION>
				</select></td>
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