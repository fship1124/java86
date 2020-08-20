package VO;

import java.util.Date;

public class NoticeVO {
	private int noticeId;
	private String title;
	private String writer;
	private String content;
	private int viewCnt;
	private Date regDate;
	private int replyCnt;

	@Override
	public String toString() {
		return "NoticeVO [noticeId=" + noticeId + ", title=" + title + ", writer=" + writer + ", content=" + content
				+ ", viewCnt=" + viewCnt + ", regDate=" + regDate + ", replyCnt=" + replyCnt + "]";
	}

	public int getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getReplyCnt() {
		return replyCnt;
	}

	public void setReplyCnt(int replyCnt) {
		this.replyCnt = replyCnt;
	}
	
	
}
