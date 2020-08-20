package day11.abs.quiz;

public class Square extends Rectangle {
	public Square(int side) {
		super(side, side);
	}
	public void area() {
		System.out.println("정사각형의 면적 : " + (side1 * side2));
	}
}