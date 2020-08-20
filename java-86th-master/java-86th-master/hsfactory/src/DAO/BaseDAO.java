package DAO;

import org.apache.ibatis.session.SqlSession;

import util.MyAppSqlConfig;

public abstract class BaseDAO {
	protected static SqlSession session = null;  
	BaseDAO() {
		session = MyAppSqlConfig.getSqlSessionInstance();
	}
}