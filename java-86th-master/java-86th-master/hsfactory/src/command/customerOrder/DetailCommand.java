package command.customerOrder;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CustomerOrderDAO;
import VO.CustomerOrderVO;
import base.command.BaseCommand;

public class DetailCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in customerOrder > DetailCommand");
		
		int no = Integer.parseInt(request.getParameter("no"));
		System.out.println("no : " + no);
		
		CustomerOrderDAO dao = new CustomerOrderDAO();
		
		List<CustomerOrderVO> list = dao.selectByNoCustomerOrder();
		
		for (CustomerOrderVO val :  list) {
			if (val.getCustomerOrderId() == no) {
				System.out.println("CustomerOrder == no");
				request.setAttribute("CustomerOrder", val);
			}
		}
	}
}
