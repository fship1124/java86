package command.customerOrder;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CustomerOrderDAO;
import VO.CustomerOrderVO;
import base.command.BaseCommand;

public class InsertCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in customerOrder > InsertCommand");
		
		String name = request.getParameter("customerOrderName");    // 고객 주문 명
		int no = Integer.parseInt(request.getParameter("company")); // 회사 ID
		int materialId = Integer.parseInt(request.getParameter("material"));       // 제품 ID
		int materialQuantity = Integer.parseInt(request.getParameter("quantity"));        // 제품 수량
		
		
		// 날짜
		String year = request.getParameter("year");
		int month = Integer.parseInt(request.getParameter("month"));
		int day = Integer.parseInt(request.getParameter("day"));
		String strDate = year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day);
		
		try {
			CustomerOrderDAO dao = new CustomerOrderDAO();
			CustomerOrderVO vo = new CustomerOrderVO();
			vo.setCustomerOrderName(name);
			vo.setCompanyId(no);
			vo.setMaterialId(materialId);
			vo.setMaterialQuantity(materialQuantity);
			
			SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date  = transFormat.parse(strDate);
			vo.setCustomerOrderDeadline(date);
			
			dao.insertCustomerOrder(vo);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
