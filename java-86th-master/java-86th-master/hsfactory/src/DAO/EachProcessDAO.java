package DAO;

import java.util.List;

import VO.EachProcessVO;

public class EachProcessDAO extends BaseDAO {

	public List<EachProcessVO> selectEachProcess() {
		String type = "epm_type";
		return session.selectList("DAO.EachProcessDAO.selectEachProcess", type);
	}

	public int insertEachProcess(EachProcessVO vo) {
		session.insert("DAO.EachProcessDAO.insertEachProcess", vo);
		session.commit();
		return vo.getEpId();
	}

	public void insertEachProcessMaterial(EachProcessVO outVo) {
		session.insert("DAO.EachProcessDAO.insertEachProcessMaterial", outVo);
		session.commit();
	}
	
	
	/*
	 	public List<CustomerOrderVO> selectCustomerOrder() {
		String type = "ordertype";
		return session.selectList("DAO.CustomOrderDAO.selectCustomerOrder", type);
	}

	public void insertCustomerOrder(CustomerOrderVO vo) {
		session.insert("DAO.CustomOrderDAO.insertCustomerOrder", vo);
		session.commit();
	}

	public List<CustomerOrderVO> selectByNoCustomerOrder() {
		String type = "ordertype";
		return session.selectList("DAO.CustomOrderDAO.selectCustomerOrder", type);
	}

	public void updateByNoCustomerOrder(CustomerOrderVO vo) {
		session.update("DAO.CustomOrderDAO.updateByNoCustomerOrder", vo);
		session.commit();
	}
	 */
}
