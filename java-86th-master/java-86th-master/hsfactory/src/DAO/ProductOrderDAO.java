package DAO;

import java.util.List;

import VO.ProductOrderVO;

public class ProductOrderDAO extends BaseDAO {

	public List<ProductOrderVO> selectProductOrder() {
		String type = "p_status";
		return session.selectList("DAO.ProductOrderDAO.selectProductOrder", type);
	}

	public void insertProductOrder(ProductOrderVO vo) {
		session.insert("DAO.ProductOrderDAO.insertProductOrder", vo);
		session.commit();
	}

	public int updateStatusByNoProductOrder(ProductOrderVO vo, String step) {
		int result = 0;
		if (step == "approval") {
			result = session.update("DAO.ProductOrderDAO.updateStatusByNoProductOrder", vo);
		} else if (step == "starting")  {
			result = session.update("DAO.ProductOrderDAO.updateStatusStatingByNoProductOrder", vo);

		// 생산완료
		} else if (step == "complete")  {
			result = session.update("DAO.ProductOrderDAO.updateStatusCompleteByNoProductOrder", vo);
			// 완제품 재고 수량 증가
		}
		session.commit();
		return result;
	}
	
	// 1 생산 시작
	// 1.1 재고 수량 감소 대상 자재 
	public List<ProductOrderVO> selectByMaterialId(ProductOrderVO vo) {
		return session.selectList("DAO.ProductOrderDAO.selectByMaterialId", vo);
	}
	
	
	// 생산 시작 -> 자재 재고 수량 감소
	public void updateByNoProductOrder(ProductOrderVO vo) {
		System.out.println("in updateByNoProductOrder");
		System.out.println(vo.getMaterialId());
		System.out.println(vo.getTotalsum());
		session.update("DAO.InventoryDAO.updateByNoProductOrder", vo);
		session.commit();
	}

	public void updateCompleteByNoProductOrder(int no) {
		session.update("DAO.InventoryDAO.updateCompleteByNoProductOrder", no);
		session.commit();
	}
}
