package command.company;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CompanyDAO;
import VO.CompanyVO;
import base.command.BaseCommand;

public class UpdateCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int comId = Integer.parseInt(request.getParameter("comId"));
		String comName = request.getParameter("comName");
		String comAdress = request.getParameter("comAdress");
		int comRegNo = Integer.parseInt(request.getParameter("comRegNo"));
		int comType = Integer.parseInt(request.getParameter("comType"));
		int comMethod = Integer.parseInt(request.getParameter("comMethod"));
		
		CompanyVO company = new CompanyVO();
		CompanyDAO dao = new CompanyDAO();

		company.setComId(comId);
		company.setComName(comName);
		company.setComAdress(comAdress);
		company.setComRegNo(comRegNo);
		company.setComType(comType);
		company.setComMethod(comMethod);
		dao.updateCompany(company);
		
	}

}
