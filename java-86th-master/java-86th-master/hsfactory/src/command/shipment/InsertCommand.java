package command.shipment;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ShipmentDAO;
import VO.ShipmentVO;
import base.command.BaseCommand;

public class InsertCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cpWarehouseId = Integer.parseInt(request.getParameter("cWarehouseId"));
		int materialId = Integer.parseInt(request.getParameter("materialId"));
		int logisticWarehouseId = Integer.parseInt(request.getParameter("lWarehouseId"));
		int companyId = Integer.parseInt(request.getParameter("companyId"));
		int materialQuantity = Integer.parseInt(request.getParameter("materialQuantity"));
		Date shipmentRegDate = null;
		try {
			shipmentRegDate = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("shipmentRegDate"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(cpWarehouseId);
		System.out.println(materialId);
		ShipmentVO shipment = new ShipmentVO();
		shipment.setCompanyId(companyId);
		shipment.setCpWarehouseId(cpWarehouseId);
		shipment.setLogisticWarehouseId(logisticWarehouseId);
		shipment.setMaterialId(materialId);
		shipment.setMaterialQuantity(materialQuantity);
		shipment.setShipmentRegDate(shipmentRegDate);
		new ShipmentDAO().insertShipment(shipment);
		
	}
}
