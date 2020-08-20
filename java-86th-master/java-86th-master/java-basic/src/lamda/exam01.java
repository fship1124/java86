package lamda;

import java.util.stream.IntStream;

public class exam01 {
	public static void main(String[] args) {
		// 기본 람다식
		IntStream.range(0, 10).forEach((int value) -> System.out.println(value));
		
		// 파라미터 생략 형식
		IntStream.range(0, 10).forEach(value -> System.out.println(value));
		
		// 메서드 래퍼런스 사용 형식
		IntStream.range(0, 10).forEach(System.out::println);
	}
}
