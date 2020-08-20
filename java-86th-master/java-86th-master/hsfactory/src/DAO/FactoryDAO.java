package DAO;

import java.util.List;

import VO.FactoryVO;

public class FactoryDAO extends BaseDAO {
	
	public List<FactoryVO> selectListFactory() {
		return session.selectList("DAO.FactoryDAO.selectListFactory");
	}
	
	public void insertFactory(FactoryVO factory) {
		session.insert("DAO.FactoryDAO.insertFactory", factory);
		session.commit();
	}
	
	public void updateFactory(FactoryVO factory) {
		session.update("DAO.FactoryDAO.updateFactory", factory);
		session.commit();
	}
	
	public void deleteFactory(int factoryId) {
		session.update("DAO.FactoryDAO.deleteFactory", factoryId);
		session.commit();
	}
	
}
