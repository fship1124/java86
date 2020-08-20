package day02;

// Random을 사용하기 위해서 위치 알려주기
// 패키지명.클래스명
import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		// 랜덤한 값을 사용하기 위해서 Random 클래스를 활용
		Random r = new Random();
		int num = r.nextInt(8) + 2;
		System.out.println("생성된 수 : " + num);
	}
}












