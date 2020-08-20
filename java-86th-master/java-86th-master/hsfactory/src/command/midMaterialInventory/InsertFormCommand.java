package command.midMaterialInventory;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.InventoryDAO;
import VO.MaterialVO;
import VO.WarehouseVO;
import base.command.BaseCommand;

public class InsertFormCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<WarehouseVO> warehouseList = new InventoryDAO().selectListWarehouseForInsert();
		List<MaterialVO> materialList = new InventoryDAO().selectListMaterialForInsert();
		request.setAttribute("materialList", materialList);
		request.setAttribute("warehouseList", warehouseList);
	}
}
