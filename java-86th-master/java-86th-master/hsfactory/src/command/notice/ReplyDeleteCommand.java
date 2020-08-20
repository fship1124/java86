package command.notice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.NoticeDAO;
import base.command.BaseCommand;

public class ReplyDeleteCommand implements BaseCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int deleteReplyId = Integer.parseInt(request.getParameter("deleteReplyId"));
		new NoticeDAO().deleteReply(deleteReplyId);
	}

}
