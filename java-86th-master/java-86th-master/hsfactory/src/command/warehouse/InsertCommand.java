package command.warehouse;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.WarehouseDAO;
import VO.WarehouseVO;
import base.command.BaseCommand;

public class InsertCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String wHouseName= request.getParameter("wHouseName");
		int wHouseType = Integer.parseInt(request.getParameter("wHouseType"));
		int inventoryAlgorism = Integer.parseInt(request.getParameter("inventoryAlgorism"));
		int factoryId = Integer.parseInt(request.getParameter("factoryId"));
		
		WarehouseVO warehouse = new WarehouseVO();
		warehouse.setwHouseName(wHouseName);
		warehouse.setwHouseType(wHouseType);
		warehouse.setInventoryAlgorism(inventoryAlgorism);
		warehouse.setFactoryId(factoryId);
		
		WarehouseDAO dao = new WarehouseDAO();
		dao.insertWHouse(warehouse);
	}

}
