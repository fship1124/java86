package day12;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest03 {
	public static void main(String[] args) {
		/*
		 * 예외 직접 처리 방식
		 * 
		 * try {}   : 예외가 발생할 만한 코드를 묶는다.
		 * 
		 * catch    : 예외가 발생했다면 발생된 예외 정보를 받아서 실제 사용자가
		 *            원하는 방식으로 처리를 진행하는 블럭
		 * 
		 * finally  : 예외 발생 여부와 상관없이 무조건 실행
		 * 
		 */
		
		// Unhandled exception type FileNotFoundException  오류에 대한 직접처리
		try {
			System.out.println(1);
			FileReader fr = new FileReader("data/a.txt");
			System.out.println(2);
		} catch(FileNotFoundException fnfe) {             //catch는 단독으로 사용 불가능. 변수 fnfe에 오류메시지 "a.txt"를 받는다
			System.out.println(3);
			
			
			/*
			// 발생된 예외의 내용 확인하기
			// 1. 간단하게 확인 메시지
			String errMsg = fnfe.getMessage();
			System.out.println(errMsg);
			
			// 2. 주소까지 자세하게 확인 
			fnfe.printStackTrace();
			*/
		} finally {
			System.out.println("무조건 실행...");
			System.out.println(4);
		}
	}

}
