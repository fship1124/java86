<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
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
	<form action="${pageContext.request.contextPath}/materialUpdate.do"
	      method="post">
	      <input type="hidden" name="mtrId" value="${material.mtrId}"/>
	<div id = "ribbon">
		<div id="ribbonMap">
			홈 > 제품 > +제품정보 수정
		</div>	
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/materialUpdateForm.do?mtrId=${material.mtrId}'; return false;">REFRESH</button>
			<button onclick="location.href='${pageContext.request.contextPath}/materialList.do'; return false;">LIST</button>
			<input type="submit" value="SUBMIT" />
			<button onclick="location.href='${pageContext.request.contextPath}/materialList.do?mtrId=${material.mtrId}'; return false;">CANCLE</button>
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
			<tr>
				<th>제품 명</th>
				<td><input type="text" name="mtrName" value="<c:out value="${material.mtrName}"></c:out>"/> </td>
				<th>자재 유형</th>
				<td style="text-align: left; padding-left: 45px;" ><select name="mtrType" /> 
					<c:forEach  var="mtrTypename" items="${mtnList}">
						<c:choose>
							<c:when test="${material.mtrTypeName == mtrTypename.mtrTypeName}">
								<option selected value="${material.mtrType}">${mtrTypename.mtrTypeName}</option>
							</c:when>
							<c:otherwise>
								<option value="${material.mtrType}">${mtrTypename.mtrTypeName}</option>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</select></td>		
				
			</tr>
			<tr>
				<th>비용</th>
				<td><input type="text" name="mtrCost" value="<c:out value="${material.mtrCost}"></c:out>"/> </td>
				<th>단위</th>
				<td style="text-align: left; padding-left: 45px;" ><select name="mtrUnit" /> 
					<c:forEach var="mlist" items="${mtuList}">
						<c:choose>
							<c:when test="${mlist.mtrUnit == material.mtrUnit}">
								<option selected value="${material.mtrUnit}">${material.mtrUnit}</option>
							</c:when>
							<c:otherwise>
								<option value="${mlist.mtrUnit}">${mlist.mtrUnit}</option>
							</c:otherwise>
						</c:choose>
					</c:forEach>
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