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
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/notice_reply.css' type='text/css' />


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
			홈 > 공지사항 > 상세
		</div>
		<div id="ribbonBtn">
			<button onclick="location.href='${pageContext.request.contextPath}/noticeDetail.do?noticeId=<c:out value="${notice.noticeId}" />'">REFRESH</button>
			<c:if test="${notice.writer eq account.id}">
			<button onclick="location.href='${pageContext.request.contextPath}/noticeUpdateForm.do?noticeId=<c:out value="${notice.noticeId}" />'">MOD</button>
			<button onclick="location.href='${pageContext.request.contextPath}/noticeDelete.do?noticeId=<c:out value="${notice.noticeId}" />'">DEL</button>
			</c:if>
			<button onclick="location.href='${pageContext.request.contextPath}/noticeList.do'">LIST</button>
		</div>
	</div>
	
	<div id = "content">
		<table id="companyTable">
			<tr>
			<th>번호</th>
			<td><c:out value="${notice.noticeId}" /></td>
			</tr>
			<tr>
			<th>글쓴이</th>
			<td><c:out value="${notice.writer}" /></td>
			</tr>
			<tr>
			<tr>
			<th>등록일시</th>
			<td>
			<fmt:formatDate var="regDate" value="${notice.regDate}" pattern="yyyy-MM-dd HH:mm:ss" />
			<c:out value="${regDate}" />
			</td>
			</tr>
			<th>제목</th>
			<td><c:out value="${notice.title}" /></td>
			</tr>
			<tr>
			<th>내용</th>
			<td><c:out value="${notice.content}" escapeXml="false" /></td>
			</tr>
		
			<c:if test="${!empty noticeFile}">
			<tr>
			<th>첨부파일</th>
			<td><a href="${pageContext.request.contextPath}/down?path=${noticeFile.filePath}&realName=${noticeFile.realFileName}&oriName=${noticeFile.oriFileName}">${noticeFile.oriFileName}</a>(${noticeFile.fileSize} byte)</td>
			</tr> 
			</c:if>
		</table>
		
		
		<div id="reply">
			<form method="post" action="${pageContext.request.contextPath}/noticeReplyInsert.do">
				<input type="hidden" name="noticeId" value="${notice.noticeId}" />	
				<input type="hidden" name="replyWriter" value="${account.id}" />	
			<table>
				<tr>
					<td><c:out value="${account.id}" /></td>
					<td><textarea class="text" name="replyContent" rows="2" cols="60" required></textarea></td>
					<td><input type="submit" value="등록" /></td>
				</tr>	
			</table>
			</form>
		</div>
		


		<div id="replyList">
		  <table>
		  	<tr>
		  		<th class="rWriter">아이디</th>
		  		<th class="rContent">댓글내용</th>
		  		<th class="rRegDate">등록일시</th>
		  		<th class="rX"></th>
		  	</tr>
			<c:forEach var="noticeReply" items="${noticeReplyList}">
			<c:choose>
		  		<c:when test="${updateReplyId eq noticeReply.replyId}">	
					<tr>
		  		<form action="${pageContext.request.contextPath}/noticeReplyUpdate.do" method="post" >
					<input type="hidden" name="noticeId" value="${notice.noticeId}" />
					<input type="hidden" name="updateReplyId" value="${noticeReply.replyId}" />
					<td class="rWriter"><c:out value="${noticeReply.replyWriter}"  /></td>
					<td class="rContent"><textarea name="replyContent" rows="2" cols="60">${noticeReply.replyContent}</textarea></td>
					<td class="rRegDate"><fmt:formatDate var="regDate" value="${noticeReply.replyRegDate}" pattern="yyyy-MM-dd HH:mm:ss" /><c:out value="${regDate}" /></td>
					<td class="rX">
						<input type="submit" value="수정" />
					  	<input type="button" value="취소" onclick="location.href='${pageContext.request.contextPath}/noticeDetail.do?noticeId=${notice.noticeId}'"/>	
					</td>
				</form>
					 </tr>
			 	</c:when>
			 	<c:otherwise>
					<tr>
					  <td class="rWriter"><c:out value="${noticeReply.replyWriter}" /></td>
					  <td class="rContent"><c:out value="${noticeReply.replyContent}" escapeXml="false"></c:out></td>
					  <td class="rRegDate"><fmt:formatDate var="regDate" value="${noticeReply.replyRegDate}" pattern="yyyy-MM-dd HH:mm:ss" /><c:out value="${regDate}" /></td>
					  <td class="rX">
					  <c:if test="${noticeReply.replyWriter eq account.id}">
					  	  <button class="delTag" href="#" type-data1="${noticeReply.replyId}" type-data2="${noticeReply.noticeId}">삭제</button>	
					  	  <button class="modTag" href="#" type-data1="${noticeReply.replyId}" type-data2="${noticeReply.noticeId}">수정</button>
					  </c:if>	
					  </td>
					</tr>
			 	</c:otherwise>
			 </c:choose>	
			 </c:forEach>
			 <c:if test="${empty noticeReplyList}">
			 <tr>
			    <td colspan='4'>댓글이 존재하지 않습니다.</td>
			 </tr>
		 	</c:if>
		 </table>
		</div>

	</div>	
</div>

<div id = "footer">
	<%@ include file='/include/footer.jspf' %>
</div>

<script>
	$(".modTag").click(function () {
		if (confirm("수정하시겠습니까?")) {
			location.href="${pageContext.request.contextPath}/noticeDetail.do?updateReplyId=" + $(this).attr("type-data1") + "&noticeId=" + $(this).attr("type-data2") ;
		};
	});
	
	$(".delTag").click(function () {
		if (confirm("삭제하시겠습니까?")) {
			location.href="${pageContext.request.contextPath}/noticeReplyDelete.do?deleteReplyId=" + $(this).attr("type-data1") + "&noticeId=" + $(this).attr("type-data2") ;
		};
	});
	
	$(".delTag2").click(function () {
		if (confirm("삭제하시겠습니까?")) {
			location.href="${pageContext.request.contextPath}/noticeReplyDelete.do?deleteReplyId=" + $(this).attr("type-data1") + "&noticeId=" + $(this).attr("type-data2") ;
		};
	});
	
	$(".text").val().replace(/\n/g, "<br>")
</script>

</body>
</html>

