package command.customerOrder;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CustomerOrderDAO;
import VO.CustomerOrderVO;
import base.command.BaseCommand;

public class UpdateCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in customerOrder > UpdateCommand");
		
		int no = Integer.parseInt(request.getParameter("no"));
		String name = request.getParameter("customerOrderName");
		
		System.out.println(no + ", " + name);
		
		CustomerOrderDAO dao = new CustomerOrderDAO();
		
		CustomerOrderVO vo = new CustomerOrderVO();
		vo.setCustomerOrderId(no);
		vo.setCustomerOrderName(name);
		dao.updateByNoCustomerOrder(vo);
	}
}
