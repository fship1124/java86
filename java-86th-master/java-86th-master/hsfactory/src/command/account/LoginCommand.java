package command.account;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.AccountDAO;
import DAO.CodeManagementDAO;
import VO.AccountVO;
import base.command.BaseCommand;

public class LoginCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
	
		AccountVO account = new AccountDAO().selectOneAccount(id);
		
		
		if (account != null && account.getPassword().equals(password)) {
			String authType = new CodeManagementDAO().selectAuthType(Integer.parseInt(account.getAuthority()));
			HttpSession session = request.getSession();
			session.setAttribute("account", account);
			session.setAttribute("authType", authType);
		} else {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('로그인에 실패하였습니다.');history.go(-1);</script>");
			out.close(); 
		}
	}
}
