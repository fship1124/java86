package day09.quiz;

class ExDate {
	private int year; 
	private int month; 
	private int date;
	ExDate() {
		this.year = 2013;
		this.month = 4;
		this.date = 1;		
	}
	ExDate(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	void showDate() {
		/*
		System.out.println(
			year + "년 " + month + "월 " + pad(date) + "일");
		*/
		System.out.printf(
			"%d년 %d월 %02d일\n", year, month, date);
	}
	
	String pad(int date) {
		return date < 10 ? "0" + date : String.valueOf(date);
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







