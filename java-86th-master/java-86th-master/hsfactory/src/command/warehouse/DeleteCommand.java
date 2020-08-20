package command.warehouse;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.WarehouseDAO;
import base.command.BaseCommand;

public class DeleteCommand implements BaseCommand {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int wHouseId = Integer.parseInt(request.getParameter("wHouseId"));
		
		WarehouseDAO dao = new WarehouseDAO();
		dao.deleteWHouse(wHouseId);
		
	}
}
