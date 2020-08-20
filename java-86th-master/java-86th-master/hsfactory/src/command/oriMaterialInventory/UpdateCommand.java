package command.oriMaterialInventory;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.InventoryDAO;
import VO.InventoryVO;
import base.command.BaseCommand;

public class UpdateCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int inventoryId = Integer.parseInt(request.getParameter("inventoryId"));
		int materialQuantity = Integer.parseInt(request.getParameter("materialQuantity"));
		int warehouseId = Integer.parseInt(request.getParameter("warehouseId"));
		InventoryVO inventory = new InventoryVO();
		inventory.setInventoryId(inventoryId);
		inventory.setMaterialQuantity(materialQuantity);
		inventory.setWarehouseId(warehouseId);
		new InventoryDAO().updateInventory(inventory);
	}

}
