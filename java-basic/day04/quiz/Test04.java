/*
	아래와 같이 출력되는 프로그램을 작성하시오.
    1
    12
    123
    1234
    12345
 */
package day04.quiz;

public class Test04 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int count = 1; count <= i; count++) {
				System.out.print(count);
			}
			System.out.println();
		}
	}	
}







