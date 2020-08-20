<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset='utf-8'>
<style >
	#commentList {width: 80%;}
	#commentList > div {width: 100%; margin-top: 5px; padding: 3px; border: 1px solid black;}
	#commentList > div > sapn:nth-child(1) {width: 10%; border-right:1px solid black; display: inline-block;}
	#commentList > div > sapn:nth-child(2) {width: 10%; display: inline-block;}
</style>
<script src="/LecBoard/js/jquery-3.1.0.js"></script>
</head>
<body>
<div class="container">
	<div class="header">
		<%@ include file="/include/topMenu.jsp" %>
	</div>	
	<div class="content">
		 <hr />
		 <h2>자바 네트워크 게시판</h2>
		 <hr />
		 <br><br>
		 <hr />
		 번호 : <c:out value="${param.no}" /><br>
		 글쓴이 : <c:out value="${board.writer}" /><br>
		 제목 : <c:out value="${board.title}" /><br>
		 내용 : <pre><c:out value="${board.content}" /></pre><br>
		 등록일시 : 
		 <fmt:formatDate var="regDate" value="${board.regDate}" 
		                 pattern="yyyy-MM-dd HH:mm:ss" />
		 <c:out value="${regDate}" /><br>
		 첨부파일 : 
		 <a href="${pageContext.request.contextPath}/down?path=${file.filePath}&realName=${file.realFileName}&oriName=${file.oriFileName}">${file.oriFileName}</a>(${file.fileSize} byte)
		 <hr />
		 <a href='updateForm.do?no=<c:out value="${param.no}" />'>수정</a>
		 <a href='delete.do?no=<c:out value="${param.no}" />'>삭제</a>
		<a href='list.do'>목록</a>
		
		
		<div id="comment">
			<form id="crForm" method="post" action="commentRegist.do">
				<table width="70%">
				<tr>
					<td><c:out value="${user.id}" /></td>
					<td><textarea name="content" rows="2" cols="60"></textarea></td>
					<td><input type="submit" value="등록" /></td>
				</tr>	
				</table>
			</form>
		</div>
		
		<form action="commentUpdate.do" method="post">
			<input type="hidden" name="no" value="${board.no}" />
			<input type="hidden" name="commentNo" value="${commentNo}" />
			
		<!-- 댓글 목록 표시 -->
		<div id="commentList">
		</div>
		
		<!-- 댓글 수정 폼 -->
		<div id="commentUpdateDiv">
			<input type="hidden" name="commentNo" />
			<span></span>
			<textarea name="content" rows="2" cols="60"></textarea>
			<button>수정</button>
		</div>
		
		<!-- 댓글 목록 
		  <table width='80%' border='1'>
		  <tr>
			<c:forEach var="comment" items="${commentList}">
			<c:choose>
		  		<c:when test="${commentNo eq comment.commentNo}">	
					<tr>
					  <td><c:out value="${comment.id}" /></td>
					  <td>
					  	<textarea name="content" rows="2" cols="60"><c:out value="${comment.content}" /></textarea>
					  </td>
					  <td colspan="2">
					  	  <input type="submit" value="수정" />	
					  </td>
					 </tr>
			 	</c:when>
			 	<c:otherwise>
					<tr>
					  <td><c:out value="${comment.id}" /></td>
					  <td>
					  		<c:out value="${comment.content}" /></td>
					  <td><fmt:formatDate var="regDate" value="${comment.regDate}" 
					                      pattern="yyyy-MM-dd HH:mm:ss" />
					      <c:out value="${regDate}" />
					  </td>
					  <td>
					  	  <a href="commentDelete.do?commentNo=${comment.commentNo}&no=${comment.no}">삭제</a>	
					  	  <a href="detail.do?commentNo=${comment.commentNo}&no=${comment.no}">수정</a>	
					  </td>
					 </tr>
			 	</c:otherwise>
			 </c:choose>	
			 </c:forEach>
			 <c:if test="${empty commentList}">
			 <tr>
			    <td colspan='4'>댓글이 존재하지 않습니다.</td>
			 </tr>
		 	</c:if>
		 </table>
		 -->
		</form>
	</div>
	<div class="footer">
		<%@ include file="/include/bottom.jsp" %>
	</div>
</div>
<script>
	// 댓글 목록 조회
	function commentList() {
		$.ajax({
			url: "/LecBoard/board/commentList.do",
			data: {no: "${board.no}"},    // 파라미터값 설정 // el표현식-: .java에서 실행 ->.class -> html -> 브라우져로전송 -> <script>는 브라우져에서 실행
			dataType: "JSON"  // 받아올 데이타 형태
		})
		.done(makeCommentList);  // 성공시 호출할 메소드
	}
	
	function makeCommentList(result) {
		
		var html = "";
		for (var i = 0; i < result.length; i++) {
			var comment = result[i];
			html += "<div id='comment" + comment.commentNo + "'>";
			html += "	<span>" + comment.id + "</span>";
			html += "	<span>" + comment.content + "</span>";
			var date = new Date(comment.regDate);
			var time = date.getFullYear() + "-" 
					 + date.getMonth() + "-"
					 + date.getDate() + " "
					 + date.getHours() + "-"
					 + date.getMinutes() + "-"
					 + date.getSeconds();
			html += "	<span>" + time + "</span>";
			html += "	<span>";
			html += "		<a href='#1' onclick='commentUpdate(" + comment.commentNo + ");'>수정</a> ";
			html += "		<a href='#1' onclick='commentDelete(" + comment.commentNo + ");'>삭제</a> ";
			html += "	</span>";
			html += "</div>";
		}
		if (result.length == 0) {
			html += "<div> 댓글이 존재하지 않습니다. </div>"
		}
		
		$("#commentList").html(html);
	}
	
	// 상세페이지 로딩시 댓글 목록 조회 ajax 호출
	commentList();
	
	// 댓글 등록 처리
	$("#crForm").submit(function () {
		var f = document.querySelector("#crForm");
		$.ajax({
			url: "/LecBoard/board/commentRegist.do",
			type: "POST",
			data: {
				no: "${board.no}",
				content: f.content.value,
				id: "${user.id}"
			},
			dataType: "json"
		})
		.done(function (result){
			console.log(result);
			f.content.value = "";	//콜백함수 초기화
			makeCommentList(result);
		})
		.fail(function () {
			alert("실패했습니다.");
		});
		// 서브밋 이벤트 중지시킴
		return false;
	});
	
	// 댓글 삭제 처리	
	function commentDelete(commentNo) {
		$.ajax({
			url: "/LecBoard/board/commentDelete.do",
			data: {
				no: "${board.no}",
				commentNo: commentNo
			},
			dataType: "json"
		})
		.done(makeCommentList);
	}
	
	// 댓글 수정 처리
	function commentUpdate(commentNo) {
		// 기존 숨겨진 div 들을 화면에 보이도록 처리
		$("#commentList > div[id^=comment]").show();
		
		//제이쿼리에서 사용되는 변수형태 : var $cDiv
		var $cDiv = $("#comment" + commentNo);
		
		//commentNo 값을 히든으로 세팅해준다
		$("#commentUpdateDiv > input").val(commentNo);
		// $(해당아이디값을 찾아서).val(값을설정해준다)
		$("#commentUpdateDiv > span:eq(0)").html($cDiv.find("span:eq(0)").html());
		$("#commentUpdateDiv > textarea").val($cDiv.find("span:eq(1)").html());
		//$cDiv 뒤로 붙여준다
		$cDiv.after($("#commentUpdateDiv").show());
		$cDiv.hide();
	}
	
	// 댓글 수정 ajax 처리
	$("#commentUpdateDiv > button").click(function () {
		// this 가 버튼인데, 버튼을 감싸고있는 div 를 $parent에 담는다.
		var $parent = $(this).parent();
		var content = $parent.find("textarea").val();
		var commentNo = $parent.find("input").val();
		console.log(content, commentNo );
		
		$.ajax({
			url: "/LecBoard/board/commentUpdate.do",
			data: {
				commentNo: commentNo,
				content: content
			}
		})
		.done(function () {
			// 수정폼 내용 초기화하기
			$parent.find("span").html("");
			$parent.find("textarea").val("");
			// commentNo
			$parent.find("input").val("");
			
			// 수정된 내용 업데이트 하기(화면) : 새로고침안해도 되는 이유
			$("#comment" + commentNo + " > span:eq(1)").html(content);
			$("#comment" + commentNo).show();
			$("#commentList").after($parent.hide());
			
		});
		// submit 이벤트 중지시킴
		return false;
	});
	// 처음 로딩할때 수정폼을 화면에서 숨겨라
	$("#commentUpdateDiv").hide();
</script>
</body>
</html>




