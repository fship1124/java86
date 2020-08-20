package command.process;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ProcessDAO;
import VO.ProcessVO;
import base.command.BaseCommand;

public class InsertCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in process > InsertCommand");
		
		String processName = request.getParameter("processName");           // 생산 주문 명
		int materialId = Integer.parseInt(request.getParameter("material"));  // 제품 번호
		int materialQuantity = Integer.parseInt(request.getParameter("materialQuantity"));  // 완제품 수량 
		String[] selectBox = request.getParameterValues("selectBox");       // 개별 공정 번호
		
		System.out.println(processName);
		System.out.println(materialId);
		System.out.println(materialQuantity);
		System.out.println(selectBox.length);
		
		ProcessDAO dao = new ProcessDAO();
		ProcessVO vo = new ProcessVO();
		vo.setProcessName(processName);
		vo.setMaterialId(materialId);
		vo.setMaterialQuantity(materialQuantity);
		
		int processId = dao.insertProcess(vo);
		
		System.out.println("processId : " + processId);
		
		for (int i = 0; i < selectBox.length; i++) {
			int epId = Integer.parseInt(selectBox[i]);
			ProcessVO mVo = new ProcessVO();
			mVo.setProcessId(processId);
			mVo.setEpId(epId);
			dao.insertProcessMapping(vo);
		}
	}
}
