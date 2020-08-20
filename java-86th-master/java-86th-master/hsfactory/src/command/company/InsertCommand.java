package command.company;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CompanyDAO;
import VO.CompanyVO;
import base.command.BaseCommand;

public class InsertCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CompanyVO company = new CompanyVO();
		
		company.setComName(request.getParameter("comName"));
		company.setComAdress(request.getParameter("comAdress"));
		company.setComRegNo(Integer.parseInt(request.getParameter("comRegNo")));
		company.setComType(Integer.parseInt(request.getParameter("comType")));
		company.setComMethod(Integer.parseInt(request.getParameter("comMethod")));
		
		CompanyDAO dao = new CompanyDAO();
		dao.insertCompany(company);
		
	}

}
