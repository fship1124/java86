package command.material;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MaterialDAO;
import VO.CompanyVO;
import VO.MaterialVO;
import base.command.BaseCommand;

public class UpdateCommandForm implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int mtrId = Integer.parseInt(request.getParameter("mtrId"));
		System.out.println("UpdateCommandForm" + mtrId);
		
		MaterialDAO dao = new MaterialDAO();
		MaterialVO material = dao.selectMaterialById(mtrId);
		List<MaterialVO> mtnList = dao.selectMaterialType();
		List<MaterialVO> mtuList = dao.selectMaterialUnit();
		
		request.setAttribute("material", material);
		request.setAttribute("mtnList", mtnList);
		request.setAttribute("mtuList", mtuList);
	}

}
