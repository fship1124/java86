package command.shipment;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ShipmentDAO;
import VO.CompanyVO;
import VO.InventoryVO;
import VO.MaterialVO;
import VO.ShipmentVO;
import VO.WarehouseVO;
import base.command.BaseCommand;

public class UpdateFormCommand implements BaseCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int shipmentId = Integer.parseInt(request.getParameter("shipmentId"));
		ShipmentVO shipment = new ShipmentDAO().selectOneShipment(shipmentId);
		
		List<InventoryVO> inventoryList = new ShipmentDAO().selectListInventory();
		List<MaterialVO> materialList = new ShipmentDAO().selectListMaterial();
		List<CompanyVO> companyList = new ShipmentDAO().selectListCompany();
		List<WarehouseVO> cwarehouseList = new ShipmentDAO().selectListWarehouse(3); // 완제품창고리스트
		List<WarehouseVO> lwarehouseList = new ShipmentDAO().selectListWarehouse(4); // 물류창고리스트
		
		request.setAttribute("materialList", materialList);
		request.setAttribute("companyList", companyList);
		request.setAttribute("cwarehouseList", cwarehouseList);
		request.setAttribute("lwarehouseList", lwarehouseList);
		request.setAttribute("inventoryList", inventoryList);
		request.setAttribute("shipment", shipment);
	}
}
