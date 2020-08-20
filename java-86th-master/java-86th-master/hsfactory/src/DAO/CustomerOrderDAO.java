package DAO;

import java.util.List;

import VO.CustomerOrderVO;

public class CustomerOrderDAO extends BaseDAO {
	
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
}
