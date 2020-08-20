<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/header.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/navibar.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/ribbon_detail.css' type='text/css' />
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
	height: 300px;
	margin: 0 auto;
}

#footer {
	height: 50px;
	margin: 0 auto;
	line-height: 50px;
}

/* list내용 */
#content { 
	border: 1px solid gray; 
}

#content > #companyTable {
	margin: 0 auto;

}

#content > #companyTable th { 
	border: 1px solid gray;
	width: 200px;
	height: 50px;
	
}

#content > #companyTable td { 
	border: 1px solid gray;
	width: 600px;
}

</style>
</head>
<body>
<div id = "container">
	<div id = "header">
		<%@ include file='/include/header.jspf' %>
	</div>
	
	<div id = "navibar">
		<%@ include file='/include/navibar.jspf' %>
	</div>
	
	<form action="${pageContext.request.contextPath}/rawMaterialOrderUpdate.do" method="post">
	<div id = "ribbon">
		<div id="ribbonBtn">
			<a href="javascript:history.back()" class="back" >뒤로가기</a>
			<input type="reset" value="새로고침">
			<input type="submit" value="수정완료">
		</div>
	</div>
	
	<div id = "content">
		<input type="hidden" name="no" value='<c:out value="${rawMaterialOrder.rawMaterialOrderId}" />'/>
		<span>원재료 구매 주문 번호</span><c:out value="${rawMaterialOrder.rawMaterialOrderId}" /><br>
		<span>원재료 구입 주문 명</span><input type="text" name="rawMaterialOrderName"><br>
		<span>회사 명</span><c:out value="${rawMaterialOrder.companyName}" /><br>
		<span>제품 명</span><c:out value="${rawMaterialOrder.materialName}" /><br>
		<span>제품 수량</span><c:out value="${rawMaterialOrder.rawMaterialQuantity}" /><br>
		<span>작업자</span><c:out value="${rawMaterialOrder.worker}" /><br>
		<span>관리자</span><c:out value="${rawMaterialOrder.administrator}" /><br>
		<span>등록 날짜</span>
		<fmt:formatDate value="${rawMaterialOrder.rawMaterialOrderRegDate}" pattern="yyyy-MM-dd"/><br>
		<span>입고 날짜</span>
		<fmt:formatDate value="${rawMaterialOrder.rawMaterialWarehousingDate}" pattern="yyyy-MM-dd HH:mm:ss" /><br>
	</div>
	</form>
	<div id = "footer">
		<%@ include file='/include/footer.jspf' %>
	</div>
</div>
</body>
</html>