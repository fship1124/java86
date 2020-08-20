package command.company;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CompanyDAO;
import VO.CompanyVO;
import base.command.BaseCommand;

public class UpdateCommandForm implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int comId = Integer.parseInt(request.getParameter("comId"));
		
		CompanyDAO dao = new CompanyDAO();
		CompanyVO company = dao.selectCompanyById(comId);
		
		List<CompanyVO> ctList = dao.selectCompanyType();
		List<CompanyVO> cmList = dao.selectCompanyMethodType();
		
		System.out.println(ctList.toString());
		request.setAttribute("company", company);
		request.setAttribute("ctList", ctList);
		request.setAttribute("cmList", cmList);
	}

}
