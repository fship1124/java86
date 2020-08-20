package DAO;

import java.util.List;

import VO.CompanyVO;

public class CompanyDAO extends BaseDAO {
	
	public List<CompanyVO> selectCompany () {
		return session.selectList("DAO.CompanyDAO.selectList");
	} 
	
	public List<CompanyVO> selectCompany (CompanyVO company) {
		return session.selectList("DAO.CompanyDAO.selectList", company);
	}
	
	public void insertCompany (CompanyVO company) {
		session.insert("DAO.CompanyDAO.insertCompany", company);
		session.commit();
	}

	public CompanyVO selectCompanyById(int comId) {
		return session.selectOne("DAO.CompanyDAO.selectCompanyById", comId);
	}
	
	public List<CompanyVO> selectCompanyType() {
		return session.selectList("DAO.CompanyDAO.selectCompanyType");
	}
	
	public List<CompanyVO> selectCompanyMethodType() {
		return session.selectList("DAO.CompanyDAO.selectCompanyMethodType");
	}
	
	public void updateCompany(CompanyVO company) {
		session.update("DAO.CompanyDAO.updateCompany", company);
		session.commit();
	}

	public void deleteCompany(int comId) {
		session.delete("DAO.CompanyDAO.deleteCompany", comId);
		session.commit();
	}
	
}
