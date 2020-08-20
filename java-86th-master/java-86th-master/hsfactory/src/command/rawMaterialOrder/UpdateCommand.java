package command.rawMaterialOrder;

import java.io.IOException;

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

public class UpdateCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in rawMaterialOrder > UpdateCommand");
		
		int no = Integer.parseInt(request.getParameter("no"));
		String name = request.getParameter("rawMaterialOrderName");
		String step = request.getParameter("step");
		System.out.println(no);
		System.out.println(name);
		System.out.println(step);
		
		RawMaterialOrderDAO dao = new RawMaterialOrderDAO();
		RawMaterialOrderVO vo = new RawMaterialOrderVO();

		if (step == null) {
			System.out.println("수정");
			vo.setRawMaterialOrderId(no);
			vo.setRawMaterialOrderName(name);
			dao.updateByNoRawMaterialOrder(vo);
		} else if (step.equals("approval")){
			System.out.println("승인");
			System.out.println(step);
			HttpSession session = request.getSession();
			AccountVO account = (AccountVO)session.getAttribute("account");
			System.out.println("로그인 정보" + account);
			String worker = account.getId();
			
			System.out.println("worker : " + worker);
			
			vo.setRawMaterialOrderId(no);
			vo.setStatus(2);
			vo.setAdministrator(account.getId());
			dao.updateStatusByNoRawMaterialOrder(vo, "approval");
		} else if (step.equals("warehousing")) {
			System.out.println("입고");
			System.out.println(step);
			HttpSession session = request.getSession();
			AccountVO account = (AccountVO)session.getAttribute("account");
			System.out.println("로그인 정보" + account);
			String worker = account.getId();
			int materialId = Integer.parseInt(request.getParameter("materialId"));
			int rawMaterialQuantity = Integer.parseInt(request.getParameter("rawMaterialQuantity"));
			System.out.println("worker : " + worker);
			System.out.println("materialId : " + materialId);
			System.out.println("rawMaterialQuantity : " + rawMaterialQuantity);
			
			vo.setRawMaterialOrderId(no);
			vo.setStatus(3);
			vo.setMaterialId(materialId);
			vo.setRawMaterialQuantity(rawMaterialQuantity);
			dao.updateStatusByNoRawMaterialOrder(vo, "warehousing");
		}
	}
}
