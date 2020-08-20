<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HS MES</title>
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/main.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/header.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/navibar.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/ribbon_list.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/footer.css' type='text/css' />
<style>

#loginbox {
	border: 1px solid white;
	background: lightgray;
	width: 400px;
	height: 130px;
	margin: 100px auto;
	line-height: 150px;
	vertical-align: middle;
	box-shadow: 3px 3px 3px lightgray;
}

#loginbox table{
	margin: 20px auto;
	vertical-align: middle;
}



</style>
</head>
<body>

	<div id = "header">
		<%@ include file='/include/header.jspf' %>
	</div>
	
	<div id = "navibar">
		<%@ include file='/include/navibar.jspf' %>
	</div>

<div id = "container">
	<div id = "ribbon">
		<div id="ribbonMap">
			홈 > 로그인
		</div>
		<div id="ribbonBtn">
		</div>
	</div>
	
	<div id = "content">
		<div id ="loginbox">
			<form name="login" action="${pageContext.request.contextPath}/accountLogin.do" method="post">
				<table>
				<tr>
				<th><label for="userid">ID</label></th>
				<td><input type="text" name="id" placeholder="yourid" required></td>
				</tr>
				<tr>
				<th><label for="password">Password</label></th>
				<td><input type="password" name="password" placeholder="password" required></td>
				</tr>
				<tr>
				<td colspan='2' style="text-align: right;"><input type="submit" value="Login"></td>
				</tr>
				</table>
			</form>
		</div>
	</div>
</div>
	
	<div id = "footer">
		<%@ include file='/include/footer.jspf' %>
	</div>


</body>
</html>
	