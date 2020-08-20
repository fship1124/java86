package DAO;

import java.util.List;

import VO.CompanyVO;
import VO.InventoryVO;
import VO.MaterialVO;
import VO.ShipmentVO;
import VO.WarehouseVO;

public class ShipmentDAO extends BaseDAO {
	
	public List<ShipmentVO> selectListShipment() {
		return session.selectList("DAO.ShipmentDAO.selectListShipment");
	}
	
	public ShipmentVO selectOneShipment(int shipmentId) {
		return session.selectOne("DAO.ShipmentDAO.selectOneShipment", shipmentId);
	}
	
	
	public List<InventoryVO> selectListInventory() {
		return session.selectList("DAO.InventoryDAO.selectListInventory");
	}
	public List<MaterialVO> selectListMaterial() {
		return session.selectList("DAO.ShipmentDAO.selectListMaterial", 1);
	}
	public List<WarehouseVO> selectListWarehouse(int no) {
		return session.selectList("DAO.ShipmentDAO.selectListWarehouse", no);
	}
	public List<CompanyVO> selectListCompany() {
		return session.selectList("DAO.ShipmentDAO.selectListCompany");
	}
	

	public void insertShipment(ShipmentVO shipment) {
		System.out.println(shipment.getCpWarehouseId() +":"+shipment.getMaterialId()+":"+shipment.getMaterialQuantity());
		session.insert("DAO.ShipmentDAO.insertShipment", shipment);
		session.update("DAO.ShipmentDAO.updateIventory", shipment);
		session.commit();
	}
	
	
	public void deleteShipment(ShipmentVO shipment) {
		session.delete("DAO.ShipmentDAO.deleteShipment", shipment);
		session.update("DAO.ShipmentDAO.updateDeleteIventory", shipment);
		session.commit();
	}
	
	
	public void updateShipment(ShipmentVO shipment) {
		session.update("DAO.ShipmentDAO.updateShipment", shipment);
		session.commit();
	}
	
	public void updateUpdateShipment(ShipmentVO shipment) {
		session.update("DAO.ShipmentDAO.updateUpdateInventory", shipment);
		session.commit();
	}
	

}
