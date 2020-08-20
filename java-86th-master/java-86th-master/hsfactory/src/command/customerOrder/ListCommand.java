package command.customerOrder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CustomerOrderDAO;
import VO.CustomerOrderVO;
import base.command.BaseCommand;

public class ListCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<CustomerOrderVO> list = new ArrayList<>();
		System.out.println("command.customerOrder.ListCommand");
		
		CustomerOrderDAO dao = new CustomerOrderDAO();
		list = dao.selectCustomerOrder();
		
		System.out.println(list.size());
		
		for (CustomerOrderVO val : list) {
			System.out.println(val.getMaterialName());
			System.out.println(val.getMaterialQuantity());
		}
		
		request.setAttribute("list", list);
	}
}


