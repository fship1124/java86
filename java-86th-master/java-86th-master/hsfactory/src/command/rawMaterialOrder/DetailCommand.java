package command.rawMaterialOrder;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.RawMaterialOrderDAO;
import VO.RawMaterialOrderVO;
import base.command.BaseCommand;

public class DetailCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in rawMaterialOrder > DetailCommand");
		int no = Integer.parseInt(request.getParameter("no"));
		System.out.println("no : " + no);
		
		RawMaterialOrderDAO dao = new RawMaterialOrderDAO();
		List<RawMaterialOrderVO> list = dao.selectByNoRawMaterialOrder();
		
		for (RawMaterialOrderVO val :  list) {
			if (val.getRawMaterialOrderId() == no) {
				System.out.println("rawMaterialOrder == no");
				System.out.println(val.toString());
				request.setAttribute("rawMaterialOrder", val);
			}
		}
	}
}
