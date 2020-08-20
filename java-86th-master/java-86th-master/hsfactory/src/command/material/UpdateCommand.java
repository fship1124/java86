package command.material;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MaterialDAO;
import VO.MaterialVO;
import base.command.BaseCommand;

public class UpdateCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int mtrId = Integer.parseInt(request.getParameter("mtrId"));
		String mtrName = request.getParameter("mtrName");
		int mtrType = Integer.parseInt(request.getParameter("mtrType"));
		int mtrCost = Integer.parseInt(request.getParameter("mtrCost"));
		String mtrUnit = request.getParameter("mtrUnit");
		System.out.println(mtrId);
		MaterialVO material = new MaterialVO();
		MaterialDAO dao = new MaterialDAO();
		
		material.setMtrId(mtrId);
		material.setMtrName(mtrName);
		material.setMtrType(mtrType);
		material.setMtrCost(mtrCost);
		material.setMtrUnit(mtrUnit);
		System.out.println("실행" + material.toString());
		
		dao.updateMaterial(material);
		
	}

}
