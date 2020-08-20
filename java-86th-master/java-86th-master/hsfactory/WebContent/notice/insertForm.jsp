<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<form name="noticeInsert" action="${pageContext.request.contextPath}/noticeInsert.do" method="post" encType="multipart/form-data">
	<div id = "ribbon">
		<div id="ribbonMap">
			홈 > 재고관리 > 원자재재고 > 등록
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/noticeInsertForm.do'; return false;">REFRESH</button>
			<input type="submit" value="SUBMIT" />
			<input type="reset" value="RESET" />
			<button onclick="location.href='${pageContext.request.contextPath}/noticeList.do'; return false;">CANCEL</button>
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
			<tr>
			<th>제목</th>
			<td><input type='text' name='title' size='70' required/></td>
			</tr>
			<tr>
			<th>글쓴이</th>
			<td style="text-align: left;"><input type='text' name='writer' value='${account.id}' size='30' readonly required /></td>
			</tr>
			<tr>
			<th>내용</th>
			<td><textarea name='content' rows='15' cols='72' required></textarea></td>
			</tr>
			<tr>
			<th>첨부파일</th>
			<td style="text-align: left;"><input type="file" name="attachFile" /></td>
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