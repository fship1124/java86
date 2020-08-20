package day11.abs.quiz;

public class Circle extends Shape {
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public void area() {
		// 원 면적 구하기
		System.out.println(
				"원의 면적 : " + (radius * radius * Math.PI));
	}
}








