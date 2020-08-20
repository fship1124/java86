package day11.abs.quiz;

public class Triangle extends Shape {
	private int width;
	private int height;
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public void area() {
		// 삼각형 면적 구하기
		System.out.println("삼각형의 면적 : " + (width * height / 2));
	}
}