package day11.abs.quiz;

public class Circle extends Shape {
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public void area() {
		// �� ���� ���ϱ�
		System.out.println(
				"���� ���� : " + (radius * radius * Math.PI));
	}
}








