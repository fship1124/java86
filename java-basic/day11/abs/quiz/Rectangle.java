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
		// ���簢�� ���� ���ϱ�
		System.out.println("���簢���� ���� : " + (side1 * side2));
	}
}
