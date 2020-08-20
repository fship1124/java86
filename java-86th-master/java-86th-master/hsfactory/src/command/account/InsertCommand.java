package command.account;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AccountDAO;
import VO.AccountVO;
import base.command.BaseCommand;

public class InsertCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String authority = request.getParameter("authority");
		AccountVO account = new AccountVO();
		account.setId(id);
		account.setPassword(password);
		account.setAuthority(authority);
		new AccountDAO().insertAccount(account);
	}

}
