package command.warehouse;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MaterialDAO;
import DAO.WarehouseDAO;
import VO.MaterialVO;
import VO.WarehouseVO;
import base.command.BaseCommand;

public class UpdateCommandForm implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int wHouseId = Integer.parseInt(request.getParameter("wHouseId"));
		System.out.println("UpdateCommandForm" + wHouseId);
		
		WarehouseDAO dao = new WarehouseDAO();
		WarehouseVO Warehouse = dao.selectMaterialById(wHouseId);
		
		List<WarehouseVO> itaList = dao.selectinventoryAlgorism();
		List<WarehouseVO> fnList = dao.selectFactoryName();
		
		request.setAttribute("Warehouse", Warehouse);
		request.setAttribute("itaList", itaList);
		request.setAttribute("fnList", fnList);
	}

}
