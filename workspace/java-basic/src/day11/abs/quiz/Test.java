package day11.abs.quiz;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		/*
		 * 조건 :
- 메인 메소드를 구현합니다. 메인 메소드의 역할은 아래와 같습니다.
- 면적을 구할 도형의 종류를 표현할 랜덤한 숫자를 생성합니다.(1 ~ 4)
예> 1-정사각형, 2-직사각형, 3-삼각형, 4-원
- 생성된 숫자에 따라서
1, 4번일 경우는 도형의 면적을 구할 랜덤 숫자를 1개 생성합니다.
2, 3번일 경우는 도형의 면적을 구할 랜덤 숫자를 2개 생성합니다.
- 면적을 구할 랜덤 숫자까지 생성되었다면 각각의 도형의 면적을 구하는 클래스를 호출합
니다.
- 출력결과는 아래와 같이 출력됩니다.
정사각형일 경우 : 정사각형의 면적은 9 입니다
직사각형일 경우 : 직사각형의 면적은 12 입니다
삼각형일 경우 : 삼각형의 면적은 6 입니다
원일 경우 : 원의 면적은 6 입니다
 ** 작성시 주의사항 **
- 도형의 면적은 각 도형클래스의 area 메서드에서 구현한다.
- 도형 클래스에서 구한 면적을 출력하는 부분은 메인클래스 처리한다.
		 */
		Random r = new Random();
		// 1-정사각형, 2-직사각형, 3-삼각형, 4-원
		
		Shape s = null;
		int command = r.nextInt(4) + 1;
		switch (command) {
		case 1: // 정사각형
			s = new Square(r.nextInt(10) + 1);
			break;
		case 2: // 직사각형
			s = new Rectangle(r.nextInt(10) + 1, r.nextInt(10) + 1);
			break;
		case 3: // 삼각형
			s = new Triangle(r.nextInt(10) + 1, r.nextInt(10) + 1);
			break;
		case 4: // 원
			s = new Circle(r.nextInt(10) + 1);
			break;
		}
		s.area();
	}
}









