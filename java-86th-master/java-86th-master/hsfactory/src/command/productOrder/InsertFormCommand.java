package command.productOrder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CustomerOrderDAO;
import DAO.ProcessDAO;
import VO.CustomerOrderVO;
import VO.ProcessVO;
import base.command.BaseCommand;

public class InsertFormCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in productOrder > InsertFormCommand");
		
		List<CustomerOrderVO> cList = new ArrayList<>();
		CustomerOrderDAO cDao = new CustomerOrderDAO();
		cList = cDao.selectCustomerOrder();
		
		List<ProcessVO> pList = new ArrayList<>();
		ProcessDAO pDao = new ProcessDAO();
		pList = pDao.selectProcess();
		
		request.setAttribute("cList", cList);
		request.setAttribute("pList", pList);
	}
}
