package command.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AccountDAO;
import DAO.CompanyDAO;
import VO.AccountVO;
import VO.CompanyVO;
import base.command.BaseCommand;

public class ListCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String orderColId = request.getParameter("orderColId");
		List<CompanyVO> cpList = new ArrayList<>();
		
		System.out.println(orderColId);
		if (orderColId != null) {
			int order = Integer.parseInt(request.getParameter("order"));
			System.out.println(order);
			CompanyVO company = new CompanyVO();
			company.setOrderColId(orderColId);
			company.setOrder(order);
			
			CompanyDAO dao = new CompanyDAO();
			cpList = dao.selectCompany(company);
			request.setAttribute("cpList", cpList);
			if (order == 1) { order = 0; }
			request.setAttribute("order", order);
			
		} else {
			CompanyDAO dao = new CompanyDAO();
			cpList = dao.selectCompany();
			request.setAttribute("cpList", cpList);
	    }

	}
}