package DAO;

import java.util.List;

import VO.InventoryVO;
import VO.MaterialVO;
import VO.WarehouseVO;

public class InventoryDAO extends BaseDAO {
	
	public List<InventoryVO> selectListInventory() {
		return session.selectList("DAO.InventoryDAO.selectListInventory");
	}
	
	public List<InventoryVO> selectListInventoryByMaterialType(String materialType) {
		return session.selectList("DAO.InventoryDAO.selectListInventoryByMaterialType", materialType);
	}
	
	
	
	public void deleteInventory(int inventoryId) {
		session.delete("DAO.InventoryDAO.deleteInventory", inventoryId);
		session.commit();
	}
	

	public void updateInventory(InventoryVO inventory) {
		session.update("DAO.InventoryDAO.updateInventory", inventory);
		session.commit();
	}
	public List<WarehouseVO> selectListWarehouse(int inventoryId) {
		return session.selectList("DAO.InventoryDAO.selectListWarehouse", inventoryId);
	}

	
	
	public void insertInventory(InventoryVO inventory) {
		session.insert("DAO.InventoryDAO.insertInventory", inventory);
		session.commit();
	}
	public List<WarehouseVO> selectListWarehouseForInsert() {
		return session.selectList("DAO.InventoryDAO.selectListWarehouseForInsert");
	}
	public List<MaterialVO> selectListMaterialForInsert() {
		return session.selectList("DAO.InventoryDAO.selectListMaterialForInsert");
	}
	
}

