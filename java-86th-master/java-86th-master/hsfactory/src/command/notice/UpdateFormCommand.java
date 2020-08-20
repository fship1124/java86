package command.notice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.NoticeDAO;
import VO.NoticeVO;
import base.command.BaseCommand;

public class UpdateFormCommand implements BaseCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int noticeId = Integer.parseInt(request.getParameter("noticeId"));
		NoticeDAO dao = new NoticeDAO();
		NoticeVO notice = dao.selectNoticeById(noticeId);
		String content = notice.getContent();
		content = content.replace("<br>", "\r\n");
		notice.setContent(content);
		request.setAttribute("notice", notice);
	}

}
