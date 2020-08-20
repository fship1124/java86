/*
1 부터 100사이의 숫자 중에서 소수를 출력하는 프로그램을 작성하시오.
소수는 그 수 자신과 1을 제외한 다른 정수로는 나누어 떨어지지 않는 정수 
    3이 소수인지 판별 : 
    3 % 1 == 0 (참)
    3 % 2 == 0 (거짓)
    3 % 3 == 0 (참)
    참인 경우가 2개인 경우 소수

출력결과
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
 */
package day04.quiz;

public class Test03 {
	public static void main(String[] args) {
		int k = 0;
		outer : 
		for (int num = 2; num <= 100; num++) {
			for (k = 2; k < num ; k++) {
				if (num % k == 0)
					continue outer;
			}
			System.out.printf("%d ", num);
		}
	}
}
