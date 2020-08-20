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

public class UpdateCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int shipmentId = Integer.parseInt(request.getParameter("shipmentId"));
		int cpWarehouseId = Integer.parseInt(request.getParameter("cWarehouseId"));
		int materialId = Integer.parseInt(request.getParameter("materialId"));
		int logisticWarehouseId = Integer.parseInt(request.getParameter("lWarehouseId"));
		int companyId = Integer.parseInt(request.getParameter("companyId"));
		int materialQuantity = Integer.parseInt(request.getParameter("materialQuantity"));
		int oriQuantity = Integer.parseInt(request.getParameter("oriQuantity"));
		Date shipmentRegDate = null;
		try {
			shipmentRegDate = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("shipmentRegDate"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ShipmentVO shipment = new ShipmentVO();
		shipment.setShipmentId(shipmentId);
		shipment.setCompanyId(companyId);
		shipment.setCpWarehouseId(cpWarehouseId);
		shipment.setLogisticWarehouseId(logisticWarehouseId);
		shipment.setMaterialId(materialId);
		shipment.setMaterialQuantity(materialQuantity);
		shipment.setShipmentRegDate(shipmentRegDate);
		new ShipmentDAO().updateShipment(shipment);
		
		ShipmentVO shipment2 = new ShipmentVO();
		shipment2.setCpWarehouseId(cpWarehouseId);
		shipment2.setMaterialId(materialId);
		shipment2.setMaterialQuantity(oriQuantity - materialQuantity);
		System.out.println(cpWarehouseId);
		System.out.println(shipment);
		System.out.println(materialId);
		System.out.println(oriQuantity - materialQuantity);
		new ShipmentDAO().updateUpdateShipment(shipment2);
		
	}

}
