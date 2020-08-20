package command.account;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AccountDAO;
import base.command.BaseCommand;

public class DeleteCommand implements BaseCommand {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int systemAuthorityId = Integer.parseInt(request.getParameter("systemAuthorityId"));
		new AccountDAO().deleteAccount(systemAuthorityId);
	}
}
