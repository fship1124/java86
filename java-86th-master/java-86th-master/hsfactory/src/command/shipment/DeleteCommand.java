package command.shipment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ShipmentDAO;
import VO.ShipmentVO;
import base.command.BaseCommand;

public class DeleteCommand implements BaseCommand {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int shipmentId = Integer.parseInt(request.getParameter("shipmentId"));
		ShipmentVO shipment = new ShipmentDAO().selectOneShipment(shipmentId);
		new ShipmentDAO().deleteShipment(shipment);

	}
}
