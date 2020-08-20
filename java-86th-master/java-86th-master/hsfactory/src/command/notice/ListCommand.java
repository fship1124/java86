package command.notice;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.NoticeDAO;
import VO.NoticeVO;
import base.command.BaseCommand;


public class ListCommand implements BaseCommand {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NoticeDAO dao = new NoticeDAO();
		List<NoticeVO> noticeList = dao.selectNotice();
		
		request.setAttribute("noticeList", noticeList);
	}
}
