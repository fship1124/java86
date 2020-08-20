package command.oriMaterialInventory;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.InventoryDAO;
import base.command.BaseCommand;

public class DeleteCommand implements BaseCommand {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int deleteinventoryId = Integer.parseInt(request.getParameter("deleteInventoryId"));
		new InventoryDAO().deleteInventory(deleteinventoryId);
	}
}
