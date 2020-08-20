package command.notice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.NoticeDAO;
import VO.NoticeVO;
import base.command.BaseCommand;

public class UpdateCommand implements BaseCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NoticeVO notice = new NoticeVO();
		notice.setNoticeId(Integer.parseInt(request.getParameter("noticeId")));
		notice.setTitle(request.getParameter("title"));
		notice.setWriter(request.getParameter("writer"));
		notice.setContent(request.getParameter("content"));

		NoticeDAO dao = new NoticeDAO();
		dao.updateNotice(notice);
	}

}
