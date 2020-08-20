package DAO;


import java.util.List;

import VO.AccountVO;

public class AccountDAO extends BaseDAO {
	public List<AccountVO> selectListAccount () {
		return session.selectList("DAO.AccountDAO.selectListAccount");
	}
	
	public AccountVO selectOneAccount (String id) {
		return session.selectOne("DAO.AccountDAO.selectOneAccount", id);
	}
	
	public void insertAccount (AccountVO account) {
		session.insert("DAO.AccountDAO.insertAccount", account);
		session.commit();
	}
	
	public void deleteAccount (int systemAuthorityId) {
		session.delete("DAO.AccountDAO.deleteAccount", systemAuthorityId);
		session.commit();
	}
	
	public void updateAccount (AccountVO account) {
		session.update("DAO.AccountDAO.updateAccount", account);
		session.commit();
	}
	
	public List<AccountVO> selectListId () {
		return session.selectList("DAO.AccountDAO.selectId");
	}
}
