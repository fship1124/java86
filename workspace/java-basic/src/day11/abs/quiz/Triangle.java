package day11.abs.quiz;

public class Triangle extends Shape {
	private int width;
	private int height;
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public void area() {
		// �ﰢ�� ���� ���ϱ�
		System.out.println("�ﰢ���� ���� : " + (width * height / 2));
	}
}