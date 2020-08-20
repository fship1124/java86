package command.notice;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.NoticeDAO;
import VO.NoticeFileVO;
import VO.NoticeReplyVO;
import VO.NoticeVO;
import base.command.BaseCommand;


public class DetailCommand implements BaseCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int noticeId = Integer.parseInt(request.getParameter("noticeId"));
		try {
			request.setAttribute("updateReplyId", Integer.parseInt(request.getParameter("updateReplyId")));	
		} catch (NumberFormatException e) { }
		
		NoticeDAO dao = new NoticeDAO();
		dao.updateNoticeViewCount(noticeId);
		NoticeVO notice = dao.selectNoticeById(noticeId);
		
		// 게시물과 연관된 파일 정보 추출
		NoticeFileVO noticeFile = dao.selectNoticeFileById(noticeId);
		
		request.setAttribute("notice", notice);
		// 파일 정보 공유
		request.setAttribute("noticeFile", noticeFile);
		
		// 댓글 목록 정보 공유
		List<NoticeReplyVO> noticeReplyList = dao.selectReplyById(noticeId);
		request.setAttribute("noticeReplyList", noticeReplyList);
	}

}
