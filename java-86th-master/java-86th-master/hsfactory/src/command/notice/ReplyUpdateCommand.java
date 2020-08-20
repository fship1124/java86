package command.notice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.NoticeDAO;
import VO.NoticeReplyVO;
import base.command.BaseCommand;

public class ReplyUpdateCommand implements BaseCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int updateReplyId = Integer.parseInt(request.getParameter("updateReplyId"));
		
		// 게시판과 파일 테이블에 저장할 글번호를 조회
		NoticeReplyVO noticeReply = new NoticeReplyVO();
		noticeReply.setReplyContent(request.getParameter("replyContent"));
		noticeReply.setReplyId(updateReplyId);
		
		// 게시물 저장 처리 부탁..
		NoticeDAO dao = new NoticeDAO();
		dao.updateReply(noticeReply);
	}

}
