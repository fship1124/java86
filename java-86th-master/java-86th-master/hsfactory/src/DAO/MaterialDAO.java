package DAO;

import java.util.List;

import VO.MaterialVO;

public class MaterialDAO extends BaseDAO {
	
	public List<MaterialVO> selectProduct () {
		return session.selectList("DAO.MaterialDAO.selectList");
	}
	public List<MaterialVO> selectProduct (MaterialVO material) {
		return session.selectList("DAO.MaterialDAO.selectList", material);
	}
	
	public void insertMaterial (MaterialVO material) {
		session.insert("DAO.MaterialDAO.insertMaterial", material);
		session.commit();
	}
	
	
	public void deleteMaterial(int mtrId) {
		session.delete("DAO.MaterialDAO.deleteMaterial", mtrId);
		session.commit();
	}
	

	public MaterialVO selectMaterialById(int mtrId) {
		return session.selectOne("DAO.MaterialDAO.selectMaterialById", mtrId);
	}
	
	public List<MaterialVO> selectMaterialType() {
		return session.selectList("DAO.MaterialDAO.selectMaterialType");
	}
	
	public List<MaterialVO> selectMaterialUnit() {
		return session.selectList("DAO.MaterialDAO.selectMaterialUnit");
	}
	
	public void updateMaterial (MaterialVO material) {
		session.update("DAO.MaterialDAO.updateMaterial", material);
		session.commit();
	}
}
