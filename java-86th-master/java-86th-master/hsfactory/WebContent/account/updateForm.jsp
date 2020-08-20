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
</head>
<body>

	<div id = "header">
		<%@ include file='/include/header.jspf' %>
	</div>
	
	<div id = "navibar">
		<%@ include file='/include/navibar.jspf' %>
	</div>
	
<div id = "container">
<form action="${pageContext.request.contextPath}/accountUpdate.do" method="post">
	<div id = "ribbon">
		<div id="ribbonMap">
			홈 > 사용자 정보 수정
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/accountUpdateForm.do?id=${accountVO.id}'; return false;">REFRESH</button>
			<input type="submit" value="SUBMIT" />
			<input type="reset" value="RESET" />
			<input type="button" value="CANCEL" onclick="location.href='${pageContext.request.contextPath}/accountList.do'"/>	
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
			<tr>
				<th>ID</th>
				<td><input type="text" name="id" value="${accountVO.id}" required readonly /></td>
				<th>PASSWORD</th>
				<td><input type="password" name="password" value="${accountVO.password}" required /></td>				
			</tr>
			<tr>
				<th>권한</th>
				<td>
				<select name="authority">
					<c:forEach var="authorityCode" items="${authorityCodeList}">
						<option value="${authorityCode.typeId}"><c:out value="${authorityCode.codeName}" /></option>
					</c:forEach>
				</select>
				</td>
				<th></th>
				<td></td>				
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