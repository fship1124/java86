package command.oriMaterialInventory;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.InventoryDAO;
import VO.InventoryVO;
import base.command.BaseCommand;

public class ListCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<InventoryVO> inventoryList = new InventoryDAO().selectListInventoryByMaterialType("원자재");
		request.setAttribute("inventoryList", inventoryList);
	}

}
