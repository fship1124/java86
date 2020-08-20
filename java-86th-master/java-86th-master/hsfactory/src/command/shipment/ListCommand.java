package command.shipment;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ShipmentDAO;
import VO.ShipmentVO;
import base.command.BaseCommand;

public class ListCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ShipmentVO> shipmentList = new ShipmentDAO().selectListShipment();
		request.setAttribute("shipmentList", shipmentList);
	}

}
