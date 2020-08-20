<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
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

<script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body>

	<div id = "header">
		<%@ include file='/include/header.jspf' %>
	</div>
	
	<div id = "navibar">
		<%@ include file='/include/navibar.jspf' %>
	</div>
	
<div id = "container">
<form action="${pageContext.request.contextPath}/accountInsert.do" method="post">
	<div id = "ribbon">
		<div id="ribbonMap">
			홈 > 사용자 추가
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/accountInsertForm.do'; return false;">REFRESH</button>
			<input type="submit" value="SUBMIT" />
			<input type="reset" value="RESET" />
			<button onclick="location.href='${pageContext.request.contextPath}/accountList.do'; return false;">CANCEL</button>
		</div>
	</div>
	<div id = "content">
		<table id="companyTable">
			<tr>
				<th>ID</th>
				<td>
				<input type="text" name="id" id="userId" placeholder="ID" required />
				<div id="result"></div>
				</td>
				<th>PASSWORD</th>
				<td><input type="password" name="password" placeholder="password" required /></td>				
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

<script>
	// 아이디 중복체크
	$("#userId").keyup(function () {
		var xhr = new XMLHttpRequest();
		xhr.onreadystatechange = function () {
			if (xhr.readyState == 4) { 
				if (xhr.status == 200) { 
					if (xhr.responseText == "중복") {
						$("#result").html("이미 사용중인 아이디 입니다.");
					} else {
						$("#result").html("사용가능 아이디 입니다.");
					}
				}
			}
		};  
		xhr.open("GET", "/hsfactory/duplication?id=" + $("#userId").val(), true);
		xhr.send(null);
	});
</script>

</body>
</html>