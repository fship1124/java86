<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/header.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/navibar.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/ribbon_list.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/footer.css' type='text/css' />
<style type="text/css">

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

#content {
	height: 500px;
	margin: 0 auto;
}

#footer {
	height: 50px;
	margin: 0 auto;
	line-height: 50px;
}


/* list내용 */

#content > #companyTable {
	margin: 0 auto;

}

#content > #companyTable th { 
	border: 1px solid gray;
	width: 150px;
}

 th, td { 
 	border: 1px solid gray; 
 	height: 30px;
 	font-size: 15px;
 } 

 th { background-color: #D9E5FF; }
 
 #ribbonBtn {
	float: right;
}

#ribbonBtn a {
	text-decoration: none;
	margin-right: 30px;
}

</style>

</head>
<body>
<div id = "container">
	<div id = "header">
		<%@ include file='../include/header.jspf' %>
	</div>
	
	<div id = "navibar">
		<%@ include file='../include/navibar.jspf' %>
	</div>
	
	<div id="ribbon">
		<div id="ribbonBtn">
			<a href="${pageContext.request.contextPath}/companyList.do">새로고침</a>
			<a href="${pageContext.request.contextPath}/companyInsertForm.do">+새추가</a>
		</div>
	</div>
	
	<div id = "content">
		<div id = "contentTable">
			<table id="table">
				<tr>
					<th id="comId" onclick="sort(this)" >회사 ID</th>				
					<th id="comName">회사 명</th>				
					<th id="comAdress">회사 주소</th>				
					<th id="comRegNo">사업자 번호</th>				
					<th id="comType">회사 유형</th>				
					<th id="comMethod">대금 결제 방식</th>				
					<th id="comDate">등록 날짜</th>				
				</tr>
				<tbody>
				<c:forEach items="${cpList}" var="company">
				<tr>
					<td><c:out value="${company.comId}"/></td>
					<td><a href='${pageContext.request.contextPath}/companyDetail.do?comId=<c:out value="${company.comId}"/>'><c:out value="${company.comName}"/></a></td>
					<td><c:out value="${company.comAdress}"/></td>
					<td><c:out value="${company.comRegNo}"/></td>
					<td><c:out value="${company.comTypeName}"/></td>
					<td><c:out value="${company.paymentName}"/></td>
					<td><fmt:formatDate value="${company.comDate}" pattern="yyyy-MM-dd HH:mm:ss" var="comDate"/>
						<c:out value="${comDate}" />
					</td>
				</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	
	</div>
	
	<div id = "footer">
		<%@ include file='../include/footer.jspf' %>
	</div>
</div>

<script type="text/javascript">
function sort(tdElt){
	var order = Number(tdElt.getAttribute("order"));
	if (order > 0){
	order = -1;
	}else{
	order = 1; 
	}
	tdElt.setAttribute("order", order);

	var tdElts = tdElt.parentNode.getElementsByTagName("th");
	var idx5 = 1;
	for(var i = 0; i < tdElts.length; i++){
	if (tdElts[i] == tdElt){
	idx5 = i;
	}
	}
	//
	// tbody 내의 tr들을 array로 받자.
	//
	var tbodyElt = tdElt.parentNode.parentNode.parentNode.getElementsByTagName("tbody")[0];
	var trElts = tbodyElt.getElementsByTagName("tr");
	var trEltsArray = [];
	for(var i = 0; i < trElts.length; i++){
	trEltsArray.push(trElts[i]);
	}
	// 정렬.
	trEltsArray.sort(function(tr1,tr2){
	return order * (Number(tr1.getElementsByTagName("td")[idx5].innerText) 
	- Number(tr2.getElementsByTagName("td")[idx5].innerText));
	});
	//
	// 정렬 결과를 테이블 tbody에 반영.
	//
	for(var i = 0; i < trElts.length; i++){
	tbodyElt.removeChild(trElts[i]);
	}
	for(var i = 0; i < trEltsArray.length; i++){
	tbodyElt.appendChild(trEltsArray[i]);
	}
	}
	</script>

</body>
</html>