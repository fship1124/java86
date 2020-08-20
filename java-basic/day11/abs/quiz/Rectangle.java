package day11.abs.quiz;

public class Rectangle extends Shape {
	protected int side1;
	protected int side2;
	public Rectangle() {}
	public Rectangle(int side1, int side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	public void area() {
		// 직사각형 면적 구하기
		System.out.println("직사각형의 면적 : " + (side1 * side2));
	}
}
