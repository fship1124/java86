package command.rawMaterialOrder;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.CustomerOrderDAO;
import DAO.RawMaterialOrderDAO;
import VO.AccountVO;
import VO.CustomerOrderVO;
import VO.RawMaterialOrderVO;
import base.command.BaseCommand;

public class InsertCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in rawMaterialOrder > InsertCommand");
		
		String name = request.getParameter("rawMaterialOrderName");    // 고객 주문 명
		int companyId = Integer.parseInt(request.getParameter("company")); // 회사 ID
		int materialId = Integer.parseInt(request.getParameter("material"));       // 제품 ID
		int materialQuantity = Integer.parseInt(request.getParameter("quantity"));        // 제품 수량
		System.out.println(name);
		System.out.println(companyId);
		System.out.println(materialId);
		System.out.println(materialQuantity);
		
		HttpSession session = request.getSession();
		AccountVO account = (AccountVO)session.getAttribute("account");
		System.out.println("로그인 정보" + account);
		String worker = account.getId();
		
		System.out.println("worker : " + worker);
		
		RawMaterialOrderDAO dao = new RawMaterialOrderDAO();
		RawMaterialOrderVO vo = new RawMaterialOrderVO();
		
		vo.setRawMaterialOrderName(name);
		vo.setCompanyId(companyId);
		vo.setMaterialId(materialId);
		vo.setRawMaterialQuantity(materialQuantity);
		vo.setWorker(worker);
		vo.setStatus(1);
		
		dao.insertRawMaterialOrder(vo);
	}
}
