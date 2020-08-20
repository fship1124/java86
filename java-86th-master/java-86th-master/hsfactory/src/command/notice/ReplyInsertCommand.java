package command.notice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.NoticeDAO;
import VO.NoticeReplyVO;
import base.command.BaseCommand;

public class ReplyInsertCommand implements BaseCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int noticeId = Integer.parseInt(request.getParameter("noticeId"));
		
		// 게시판과 파일 테이블에 저장할 글번호를 조회
		NoticeReplyVO noticeReply = new NoticeReplyVO();
		noticeReply.setNoticeId(noticeId);
		String replyContent = request.getParameter("replyContent");
		replyContent = replyContent.replace("\r\n","<br>");
		noticeReply.setReplyContent(replyContent);
		noticeReply.setReplyWriter(request.getParameter("replyWriter"));
		NoticeDAO dao = new NoticeDAO();
		dao.insertReply(noticeReply);
	}

}
