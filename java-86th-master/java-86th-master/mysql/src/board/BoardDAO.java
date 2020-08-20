package board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import util.MyAppSqlConfig;


public class BoardDAO {
	private static SqlSession session;

	public BoardDAO()  {
		session = MyAppSqlConfig.getSqlSessionInstance();
	}
	
	public List<BoardVO> selectList() {
		return session.selectList("d.selectList");
	}
}
