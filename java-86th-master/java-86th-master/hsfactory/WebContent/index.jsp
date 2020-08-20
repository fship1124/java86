<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HS MES</title>
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/main.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/header.css'	type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/navibar.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/ribbon_list.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/footer.css' type='text/css' />
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/list_table.css' type='text/css' />
<script type="text/javascript">
   window.location.href= '${pageContext.request.contextPath}/noticeList.do';
</script>
</head>
<body>

	<div id="header">
		<%@ include file='/include/header.jspf'%>
	</div>

	<div id="navibar">
		<%@ include file='/include/navibar.jspf'%>
	</div>

	<div id="container">
		<div id="ribbon">
			<div id="ribbonMap">
				홈
			</div>
			<div id="ribbonBtn">
			</div>
		</div>

		<div id="content">
		</div>
	</div>

	<div id="footer">
		<%@ include file='/include/footer.jspf'%>
	</div>

</body>
</html>