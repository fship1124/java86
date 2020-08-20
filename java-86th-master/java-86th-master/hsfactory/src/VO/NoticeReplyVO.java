package VO;

import java.util.Date;

public class NoticeReplyVO {
	private int replyId;
	private int noticeId;
	private String replyWriter;
	private String replyContent;
	private Date replyRegDate;
	public int getReplyId() {
		return replyId;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}
	public int getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}
	public String getReplyWriter() {
		return replyWriter;
	}
	public void setReplyWriter(String replyWriter) {
		this.replyWriter = replyWriter;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public Date getReplyRegDate() {
		return replyRegDate;
	}
	public void setReplyRegDate(Date replyRegDate) {
		this.replyRegDate = replyRegDate;
	}
	@Override
	public String toString() {
		return "NoticeReplyVO [replyId=" + replyId + ", noticeId=" + noticeId + ", replyWriter=" + replyWriter
				+ ", replyContent=" + replyContent + ", replyRegDate=" + replyRegDate + "]";
	}
	
}
