package command.material;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MaterialDAO;
import VO.MaterialVO;
import base.command.BaseCommand;

public class ListCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String orderColId = request.getParameter("orderColId");
		
		List<MaterialVO> pdList = new ArrayList<>();
		MaterialDAO dao = new MaterialDAO();
		
		if (orderColId != null) {
			MaterialVO material = new MaterialVO();
			material.setOrderColId(orderColId);
			pdList = dao.selectProduct(material);
		} else {
			pdList = dao.selectProduct();
		}
		
		request.setAttribute("pdList", pdList);
		
	}

}
