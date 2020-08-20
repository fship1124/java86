package command.productOrder;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.ProductOrderDAO;
import VO.AccountVO;
import VO.ProductOrderVO;
import base.command.BaseCommand;

public class InsertCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in productOrder > InsertCommand");
		
		String name = request.getParameter("productOrderName");    // 고객 주문 명
		int processId = Integer.parseInt(request.getParameter("process")); // 회사 ID
		int customerOrderId = Integer.parseInt(request.getParameter("customerOrder"));      
		
		HttpSession session = request.getSession();
		AccountVO account = (AccountVO)session.getAttribute("account");
		String worker = account.getId();
		
		System.out.println("로그인 정보" + account);
		System.out.println("worker : " + worker);
		
		ProductOrderDAO dao = new ProductOrderDAO();
		ProductOrderVO vo = new ProductOrderVO();
		
		vo.setProductionOrderName(name);
		vo.setProcessId(processId);
		vo.setCustomerOrderId(customerOrderId);
		
		vo.setWorker(worker);
		vo.setStatus(1);
		
		dao.insertProductOrder(vo);
	}
}
