package quiz;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig2;

public class QuizDAO {
	private static SqlSession sqlMapper;
	public QuizDAO() {
		sqlMapper = MyAppSqlConfig2.getSqlSessionInstance();
	}
	public List<BoardListVO> getBoard(){
		return sqlMapper.selectList("quiz.QuizDAO.getBoard");
	}
}
