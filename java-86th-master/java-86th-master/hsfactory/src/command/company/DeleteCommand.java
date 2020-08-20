package command.company;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CompanyDAO;
import base.command.BaseCommand;

public class DeleteCommand implements BaseCommand {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int comId = Integer.parseInt(request.getParameter("comId"));
		
		CompanyDAO dao = new CompanyDAO();
		dao.deleteCompany(comId);
		
	}
}
