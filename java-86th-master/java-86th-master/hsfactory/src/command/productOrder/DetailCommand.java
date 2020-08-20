package command.productOrder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ProductOrderDAO;
import VO.ProductOrderVO;
import base.command.BaseCommand;

public class DetailCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in productOrder > DetailCommand");
		List<ProductOrderVO> list = new ArrayList<>();
		int no = Integer.parseInt(request.getParameter("no"));
		System.out.println("no : " + no);
		
		ProductOrderDAO dao = new ProductOrderDAO();
		list = dao.selectProductOrder();
		
		for (ProductOrderVO val : list) {
			if (val.getProductionOrderId() == no) {
				System.out.println("productOrder == no");
				System.out.println("status : " + val.getStatus());
				request.setAttribute("productOrder", val);
			}
		}
	}
}
