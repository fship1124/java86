package DAO;

import java.util.List;

import VO.ProcessVO;

public class ProcessDAO extends BaseDAO {

	public List<ProcessVO> selectProcess() {
		return session.selectList("DAO.ProcessDAO.selectProcess");
	}

	public List<ProcessVO> selectAjaxProcess() {
		return session.selectList("DAO.ProcessDAO.selectAjaxProcess");
	}

	public int insertProcess(ProcessVO vo) {
		session.insert("DAO.ProcessDAO.insertProcess", vo);
		session.commit();
		return vo.getProcessId();
	}

	public void insertProcessMapping(ProcessVO vo) {
		session.insert("DAO.ProcessDAO.insertProcessMapping", vo);
		session.commit();
	}
}
