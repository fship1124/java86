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
<style type="text/css">






/*
div { border: 1px solid black; }

#container { 
	width: 1300px;  
	margin: 0 auto;  
	overflow: hidden;  
}  

#header, #navibar, #content, #footer, #ribbon {   
	width: 1280px;   
	margin: 0 auto;   
}  

#content {  
	height: 600px;  
}  

#header {   
	height: 50px;  
	line-height: 50px;  
}  

#navibar {   
	height: 50px;   
}  

#ribbon {  
	height: 40px;  
	line-height: 40px;  
}  

#home {  
	height: 800px;  
	margin: 0 auto;  
	background-color: skyblue;  
}  

#tree {  
	height: 800px;  
	margin: 0 auto;  
	background-color: gray;  
}  

#footer {  
	height: 50px;  
	margin: 0 auto;  
	line-height: 50px;  
}  


select, span { margin: 20px; }  

table {  
	margin: 10px auto;  
	width: 300px;  
	border: 2px solid tomato;  
}  

th, td {  
	width: 100px;  
	height: 20px;  
	border: 1px solid black;  
}  

#in, #out {  
	margin: 30px auto;  
	width: 300px;  
	height: 300px;  
}	  

#effectiveness, #addProcess { margin-left: 20px;}  

#tab1, #tab2 { margin-left: 10px; }  

#sList {  
	float: left;  
	width: 500px;  
	height: 300px;  
	border: 2px solid tomato;  
}  

#mList {  
	float: left;  
	width: 400px;  
	height: 700px;  
	border: 2px solid tomato;  
	margin-left: 300px;  
	text-align: center;  
}  

*/

table {
	margin: 0 auto;
}

.hometable { width: 200px; height: 100px}

table, .hometable {
	padding: 10px;
	border-collapse: collapse;
	border: 1px solid lightgray;
}

#tab1, #tab2 {
	margin-left: 20px;
	border:1x solid #ff0080;    /*---테두리 정의---*/
	font:12px 굴림;      /*--폰트 정의---*/
	font-weight:bold;   /*--폰트 굵기---*/
	color:white;    /*--폰트 색깔---*/
	width:130;height:30;  /*--버튼 크기---*/
}

#tab1:hover {
	color:#ff0080;    /*--폰트 색깔---*/
}
#tab2:hover {
	color:#ff0080;    /*--폰트 색깔---*/
}


#tab2 {
	margin-left: 10px;
}

#tab {
	margin: 10px;
	background-color: #999999;
}

#container {
	height: 800px;  
}

#sList {
	float: left;  
	margin: 30px;
	width: 500px;  
	height: 600px;  
	border: 1px solid lightgray;  
}

#mList {
	float: left;  
	margin-left: 70px;
	margin-top: 30px;
	width: 500px;  
	height: 700px;  
	border: 1px solid lightgray;  
}

#span1 {
	widht: 50px;
	margin-left: 30px;
}

#span2 {
	widht: 50px;
	margin-left: 40px;
}

select {
	margin: 10px;
}

#addProcess {
    border: 2px solid #c0c0c0;
    background-Color: #ffffff;
    font-size: 7px;
    font-weight: bold;
    color: #000000;
    width: 30px;
    height: 24px;
    margin-left : 100px;
}
#addProcess:hover {
	color:#ffffff;
	background-Color:#000000;   
}

#cycle {
	width: 50px;
}

#in, #out {  
	margin: 30px auto;  
	width: 300px;  
	height: 300px;  
	overflow: auto;
}	

#outtable, #intable {  
	margin: 10px auto;  
	width: 300px;  
	border: 2px solid lightgray;  
}  

th, td {
	border: 2px solid lightgray;  
}
</style>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
</head>

<body>
	<div id = "header">
		<%@ include file='/include/header.jspf' %>
	</div>
	<div id = "navibar">
		<%@ include file='/include/navibar.jspf' %>
	</div>
<div id = "container">
	<form action="${pageContext.request.contextPath}/processInsert.do" method="post">
	<div id = "ribbon">
		<div id="ribbonMap">
			홈 > 생산 공정 > 생산 공정 > 등록
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/processInsertForm.do'; return false;">REFRESH</button>
			<input type="submit" value="확인">
			<button onclick="location.href='${pageContext.request.contextPath}/processList.do'; return false; ">CANCEL</button>
		</div>
	</div>
	<div id="tab">
		<a href="#" id="tab1" onclick="page1Show()">홈</a>
		<a href="#" id="tab2" onclick="page2Show()">트리</a>
	</div>
	
	<!-- home 페이지 -->
	<div id = "home">
		<table id="companyTable">
		<tr>
			<th class="hometable">생산 공정 명</th>
			<td class="hometable"><input type="text" name="processName" required></td>
		</tr>
		<tr>
			<th class="hometable">제품 번호</th>
			<td class="hometable">
			<select name="material">
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
			<th class="hometable">제품 수량</th>
			<td class="hometable"><input type="text" name="materialQuantity" required></td>
		</tr>
		</table>
	</div>
	

	
	<!-- tree 페이지 -->
	<div id = "tree">
		<div id="sList">
			<span id="span1">개별 공정</span>
			<span id="span2">Cycle</span>
			<button type="button" id="addProcess" onclick='doAdd()'
			style="width:60;height:45;">+</button>
			
			<br>
			<select name="selectBox">
			    <option value="">개별공정 선택</option>
				<option value="1">포장 공정</option>
				<option value="2">니스칠 공정</option>
				<option value="3">조립 공정</option>
				<option value="4">목재 재단 공정</option>
			</select>
			<input type="text" id="cycle"> 
			<br>
		</div>
		
		<button type="button" id="effectiveness">검사</button>
		<button type="button" id="cancel">취소</button>
		<div id = "mList">
			<div id="out">
				<p>Output Product</p>
				<table id="outtable">
					<tr>
						<th>product</th><th>quantity</th>
					</tr>
				</table>
			</div>
			<div id="out">
				<p>Input Product</p>
				<table id="intable">
					<tr>
						<th>product</th><th>quantity</th>
					</tr>
				</table>
			</div>
		</div>
	</div>
	</form>
</div>
	<div id = "footer">
		<%@ include file='/include/footer.jspf' %>
	</div>
<script>
$(document).ready(function(){
	var page1 = document.getElementById("home");
	var page2 = document.getElementById("tree");
	page2.style.display = "none";
});

function page2Show() {
	var page1 = document.getElementById("home");
	var page2 = document.getElementById("tree");
	page1.style.display = "none";
	page2.style.display = "block";
}

function page1Show() {
	var page1 = document.getElementById("home");
	var page2 = document.getElementById("tree");
	page1.style.display = "block";
	page2.style.display = "none";
}

function doAdd() {
	var sList = document.getElementById("sList");
	var selectBox = document.createElement("select");
	selectBox.setAttribute("name", "selectBox");
	var option = document.createElement("option");
	option.setAttribute("value", "");
	var text = document.createTextNode("공정선택");
	option.appendChild(text);
	selectBox.appendChild(option);
	
	option = document.createElement("option");
	option.setAttribute("value", "1");
	text = document.createTextNode("포장 공정");
	option.appendChild(text);
	selectBox.appendChild(option);
	
	option = document.createElement("option");
	option.setAttribute("value", "2");
	text = document.createTextNode("니스칠 공정");
	option.appendChild(text);
	selectBox.appendChild(option);
	
	option = document.createElement("option");
	option.setAttribute("value", "3");
	text = document.createTextNode("못박는 공정");
	option.appendChild(text);
	selectBox.appendChild(option);
	
	option = document.createElement("option");
	option.setAttribute("value", "4");
	text = document.createTextNode("목재 재단 공정");
	option.appendChild(text);
	selectBox.appendChild(option);
	
	sList.appendChild(selectBox);
	var br = document.createElement('br');
	sList.appendChild(br);
}

$("#cancel").click(function() {
	$(".tr").remove();
	 
	var selectArr = $("select[name=selectBox]");
	
	var c = 1;
	for (var k = 0; k < selectArr.length; k++) {
		selectArr[1].remove();
		selectArr[2].remove();
		selectArr[3].remove();
		selectArr[4].remove();
		selectArr[5].remove();
	}
}); 


$("#effectiveness").click(function() {
	if ($("#cycle").val() == "") {
		alert("공정 사이클 수량을 입력하세요.");
		$("#cycle").focus();
		return;
	}
	
	var selectArr = $("select[name=selectBox]");
	
	var c = 1;
	for (var k = 0; k < selectArr.length; k++) {
		if (parseInt(selectArr[k].value) == c++) {
		} else {
			alert("유효하지 않은 공정입니다.");
			selectArr[1].remove();
			selectArr[2].remove();
			selectArr[3].remove();
			selectArr[4].remove();
			selectArr[5].remove();
			return;
		}
	}
	
	var cycle = parseInt($("#cycle").val());
	
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4) {
			if (xhr.status == 200) {
				var jsonList = JSON.parse(xhr.responseText);
				
				for (var i = 0; i < jsonList.length; i++) {
					var m = jsonList[i];
					for (var j = 0; j < selectArr.length; j++) { 
						if (parseInt(m.epId) == parseInt(selectArr[j].value)) {
							if (parseInt(m.epmType) == 0) {
								console.log("parseInt(m.epmType) == 0");
								$('#outtable > tbody:last').append('<tr class="tr"><td>' + m.materialName + '</td><td>' + m.materialQuantity * cycle + '</td></tr>');
							} else {
								console.log("parseInt(m.epmType) != 0");
								$('#intable > tbody:last').append('<tr class="tr"><td>' + m.materialName + '</td><td>' + m.materialQuantity * cycle + '</td></tr>');
							}
						}
					}
				}
			}
		}
	}
	xhr.open("GET", "${pageContext.request.contextPath}/processAjax")
	xhr.send(null);
}); 

</script>
</body>
</html>