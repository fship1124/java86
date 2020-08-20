package kr.co.mlec.board;

public class BoardFile {
	private int no;
	private int fileNo;
	private String oriFileName;
	private String realFileName;
	private String filePath;
	private long fileSize;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getFileNo() {
		return fileNo;
	}
	public void setFileNo(int fileNo) {
		this.fileNo = fileNo;
	}
	public String getOriFileName() {
		return oriFileName;
	}
	public void setOriFileName(String oriFileName) {
		this.oriFileName = oriFileName;
	}
	public String getRealFileName() {
		return realFileName;
	}
	public void setRealFileName(String realFileName) {
		this.realFileName = realFileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	@Override
	public String toString() {
		return "BoardFile [no=" + no + ", fileNo=" + fileNo + ", oriFileName=" + oriFileName + ", realFileName="
				+ realFileName + ", filePath=" + filePath + ", fileSize=" + fileSize + "]";
	}
	
	
}
