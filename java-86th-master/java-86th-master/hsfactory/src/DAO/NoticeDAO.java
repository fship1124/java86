package DAO;

import java.util.List;

import VO.NoticeFileVO;
import VO.NoticeReplyVO;
import VO.NoticeVO;


public class NoticeDAO extends BaseDAO {
	
	public int insertNotice(NoticeVO notice) {
		session.insert("DAO.NoticeDAO.insertNotice", notice);
		session.commit();
		return notice.getNoticeId();
	}
	public void updateNotice(NoticeVO notice) {
		session.update("DAO.NoticeDAO.updateNotice", notice);
		session.commit();
	}
	
	public void deleteNotice(int delNo) {
		session.delete("DAO.NoticeDAO.deleteNotice", delNo);
		session.commit();
	}
	
	public List<NoticeVO> selectNotice() {
		return session.selectList("DAO.NoticeDAO.selectNotice");
	}
	
	public void updateNoticeViewCount (int noticeId) {
		session.update("DAO.NoticeDAO.updateNoticeViewCount", noticeId);
		session.commit();
	}
	
	public int selectReplyCountById (int noticeId) {
		return session.selectOne("DAO.NoticeDAO.selectReplyCountById", noticeId);
	}
	
	/**
	 * 매개변수에 해당하는 글번호의 게시물을 반환하는 기능
	 * @param no
	 * @return  null 이 반환될 경우 해당 번호의 게시물이 존재하지 않는경우
	 *          null 이 아닌값이 반환된 경우는 해당 번호의 게시물을 찾은 경우
	 */
	public NoticeVO selectNoticeById(int findNo) {
		return session.selectOne("DAO.NoticeDAO.selectNoticeById", findNo);
	}
	public void insertNoticeFile(NoticeFileVO noticeFile) {
		session.insert("DAO.NoticeDAO.insertNoticeFile", noticeFile);
		session.commit();
	}
	public NoticeFileVO selectNoticeFileById(int findNo) {
		return session.selectOne("DAO.NoticeDAO.selectNoticeFileById", findNo);
	}
	public void insertReply(NoticeReplyVO noticeReply) {
		session.insert("DAO.NoticeDAO.insertNoticeReply", noticeReply);
		session.commit();
	}
	public List<NoticeReplyVO> selectReplyById(int findNo) {
		return session.selectList("DAO.NoticeDAO.selectNoticeReplyById", findNo);
	}
	public void deleteReply(int ReplyNo) {
		session.delete("DAO.NoticeDAO.deleteNoticeReply", ReplyNo);
		session.commit();
	}
	public void updateReply(NoticeReplyVO noticeReply) {
		session.update("DAO.NoticeDAO.updateNoticeReply", noticeReply);
		session.commit();
	}
}
