package day09.quiz;

class ExDate {
	private int year;
	private int month;
	private int date;
	
	ExDate () {
		this.year = 2013;
		this.month = 4;
		this.date = 1;
		System.out.printf("%d년\t%d월\t%02d일\n", year, month, date);
	}
	
	void showDate () {
	}
	
	
	ExDate (int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
		System.out.printf("%d년\t%d월\t%02d일\n", year, month, date);
	}
	
}


public class ExDateMain {
    public static void main(String[] args) {
    	ExDate ex01 = new ExDate();
    	ex01.showDate();
    	
    	ExDate ex02 = new ExDate(2013, 8, 11);
    	ex02.showDate();
	}
}
