package DAO;

import java.util.List;

import VO.CustomerOrderVO;
import VO.RawMaterialOrderVO;

public class RawMaterialOrderDAO extends BaseDAO {

	public List<RawMaterialOrderVO> selectRawMaterialOrder() {
		String type = "m_status";
		return session.selectList("DAO.RawMaterialOrderDAO.selectRawMaterialOrder", type);
	}

	public void insertRawMaterialOrder(RawMaterialOrderVO vo) {
		session.insert("DAO.RawMaterialOrderDAO.insertRawMaterialOrder", vo);
		session.commit();
	}

	public List<RawMaterialOrderVO> selectByNoRawMaterialOrder() {
		String type = "m_status";
		return session.selectList("DAO.RawMaterialOrderDAO.selectRawMaterialOrder", type);
	}

	public void updateByNoRawMaterialOrder(RawMaterialOrderVO vo) {
		session.update("DAO.RawMaterialOrderDAO.updateByNoRawMaterialOrder", vo);
		session.commit();
	}

	public void updateStatusByNoRawMaterialOrder(RawMaterialOrderVO vo, String step) {
		if (step == "approval") {
			session.update("DAO.RawMaterialOrderDAO.updateStatusByNoRawMaterialOrder", vo);
		} else {
			session.update("DAO.RawMaterialOrderDAO.updateStatusWareDateByNoRawMaterialOrder", vo);
			// 제품 재고 수량 증가
			session.update("DAO.RawMaterialOrderDAO.updateRawMaterialQuantityByNoINVENTORY", vo);
		}
		session.commit();
	}
}
