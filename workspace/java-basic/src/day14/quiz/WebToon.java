package day14.quiz;

public class WebToon {
    private int no;
    private String title;
    private int dayOfWeek;
    private String author;
    private int genre;
    private double score;
    
    public WebToon (int no, String title, int dayOfWeek,
    		      String author, int genre, double score) {
    	this.no = no;
    	this.title = title;
    	this.dayOfWeek = dayOfWeek;
    	this.author = author;
    	this.genre = genre;
    	this.score = score;
    }
    
    
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getGenre() {
		return genre;
	}
	public void setGenre(int genre) {
		this.genre = genre;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return "WebToon [no=" + no + ", title=" + title + ", dayOfWeek=" + dayOfWeek + ", author=" + author + ", genre="
				+ genre + ", score=" + score + "]";
	}
    
    
    	
}
