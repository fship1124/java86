package DAO;

import java.util.List;

import VO.WarehouseVO;

public class WarehouseDAO extends BaseDAO {
	
	public List<WarehouseVO> selectList () {
		return session.selectList("DAO.WarehouseDAO.selectList");
	}
	
	public void insertWHouse (WarehouseVO warehouse) {
		session.insert("DAO.WarehouseDAO.insertWHouse", warehouse);
		session.commit();
	}
	
	public void deleteWHouse (int wHouseId) {
		session.delete("DAO.WarehouseDAO.deleteWHouse", wHouseId);
	}
	
	public WarehouseVO selectMaterialById (int wHouseId) {
		return session.selectOne("DAO.WarehouseDAO.selectMaterialById", wHouseId);
	}
	
	public List<WarehouseVO> selectinventoryAlgorism () {
		return session.selectOne("DAO.WarehouseDAO.selectinventoryAlgorism");
	}
	
	public List<WarehouseVO> selectFactoryName () {
		return session.selectOne("DAO.WarehouseDAO.selectFactoryName");
	}
	
}
