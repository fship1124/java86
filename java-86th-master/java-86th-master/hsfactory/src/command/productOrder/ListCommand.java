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

public class ListCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ProductOrderVO> list = new ArrayList<>();
		ProductOrderDAO dao = new ProductOrderDAO();
		list = dao.selectProductOrder();
		System.out.println("list");
		System.out.println(list);
		System.out.println(list.size());
		
		for (ProductOrderVO val : list) {
			System.out.println(val.getProductionOrderName());
		}
		request.setAttribute("list", list);
	}
}
