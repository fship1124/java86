package command.oriMaterialInventory;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.InventoryDAO;
import VO.InventoryVO;
import VO.WarehouseVO;
import base.command.BaseCommand;

public class UpdateFormCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int updateInventoryId = Integer.parseInt(request.getParameter("updateInventoryId"));
		List<InventoryVO> inventoryList = new InventoryDAO().selectListInventoryByMaterialType("원자재");
		List<WarehouseVO> warehouseList = new InventoryDAO().selectListWarehouse(updateInventoryId);
		
		request.setAttribute("updateInventoryId", updateInventoryId);
		request.setAttribute("inventoryList", inventoryList);
		request.setAttribute("warehouseList", warehouseList);
	}

}
