package command.material;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MaterialDAO;
import VO.MaterialVO;
import base.command.BaseCommand;

public class InsertCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mtrName = request.getParameter("mtrName");
		int mtrType = Integer.parseInt(request.getParameter("mtrType"));
		int mtrCost = Integer.parseInt(request.getParameter("mtrCost"));
		String mtrUnit = request.getParameter("mtrUnit");
		
		MaterialVO material = new MaterialVO();
		material.setMtrName(mtrName);
		material.setMtrType(mtrType);
		material.setMtrCost(mtrCost);
		material.setMtrUnit(mtrUnit);
		
		MaterialDAO dao = new MaterialDAO();
		dao.insertMaterial(material);
	}

}
