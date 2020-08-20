package DAO;

import java.util.List;

import VO.CodeManagementVO;

public class CodeManagementDAO extends BaseDAO {
	public String selectAuthType (int typeId) {
		return session.selectOne("DAO.CodeDAO.selectAuthType", typeId);
	}
	
	public List<CodeManagementVO> selectListCode () {
		return session.selectList("DAO.CodeDAO.selectListCode");
	}
	
	public List<CodeManagementVO> selectListCodeByTypeName (String typeName) {
		return session.selectList("DAO.CodeDAO.selectListCodeBytypeName", typeName);
	}
}
