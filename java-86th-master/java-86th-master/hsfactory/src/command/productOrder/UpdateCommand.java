package command.productOrder;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.ProductOrderDAO;
import VO.AccountVO;
import VO.ProductOrderVO;
import base.command.BaseCommand;

public class UpdateCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in productOrder > UpdateCommand");
		
		int no = Integer.parseInt(request.getParameter("no"));  // 생산 공정 번호
		//String name = request.getParameter("rawMaterialOrderName");
		String step = request.getParameter("step");
		System.out.println(no);
		//System.out.println(name);
		System.out.println(step);
		
		ProductOrderDAO dao = new ProductOrderDAO();
		ProductOrderVO vo = new ProductOrderVO();
		
		if (step == null) {
			System.out.println("수정");
		} else if (step.equals("approval")){
			System.out.println("승인");
			System.out.println(step);
			HttpSession session = request.getSession();
			AccountVO account = (AccountVO)session.getAttribute("account");
			System.out.println("로그인 정보" + account);
			String administrator = account.getId();
			
			System.out.println("administrator : " + administrator);
			
			vo.setProductionOrderId(no);
			vo.setStatus(2);
			vo.setAdministrator(administrator);
			dao.updateStatusByNoProductOrder(vo, "approval");

		} else if (step.equals("starting")) {
			System.out.println("시작");
			System.out.println(step);
			HttpSession session = request.getSession();
			AccountVO account = (AccountVO)session.getAttribute("account");
			System.out.println("로그인 정보" + account);
			String worker = account.getId();
			System.out.println("worker : " + worker);
			
			vo.setProductionOrderId(no);
			vo.setStatus(3);
			int result = dao.updateStatusByNoProductOrder(vo, "starting");
			System.out.println("result : " + result);
			
			if (result == 1) {
				System.out.println("result == 1");
				vo.setEpmType(1);
				System.out.println("setProductionOrderId : " + no);
				List<ProductOrderVO> list = dao.selectByMaterialId(vo);
				System.out.println("생산 투입 대상 자재 개수 :");
				System.out.println(list.size());
				
				for (ProductOrderVO val : list) {
					System.out.println(val.toString());
					int materialId = val.getMaterialId();
					int totalsum = val.getTotalsum();
					System.out.println("materialId : ");
					System.out.println(materialId);
					System.out.println("totalsum : ");
					System.out.println(totalsum);
					
					vo.setMaterialId(materialId);
					vo.setTotalsum(totalsum);
					dao.updateByNoProductOrder(vo);
				}
			}
			
		} else if (step.equals("complete")) { 
			System.out.println("생산 완료");
			System.out.println(step);
			HttpSession session = request.getSession();
			AccountVO account = (AccountVO)session.getAttribute("account");
			System.out.println("로그인 정보" + account);
			String worker = account.getId();
			System.out.println("worker : " + worker);
			
			vo.setProductionOrderId(no);
			vo.setStatus(4);
			dao.updateStatusByNoProductOrder(vo, "complete");
			int processId = Integer.parseInt(request.getParameter("processId"));
			System.out.println("processId : " + processId);
			dao.updateCompleteByNoProductOrder(processId);
		}
	}
}
