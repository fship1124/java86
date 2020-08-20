package day12;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest03 {
	public static void main(String[] args) {
		/*
		 *  예외 직접 처리 방식
		 *  
		 *  try { }    :  예외가 발생할 만한 코드를 묶는다.
		 *  
		 *  catch      :  예외가 발생했다면 발생된 예외 정보를 받아서
		 *                실제 사용자가 원하는 방식으로 처리를 진행하는 블럭
		 *  
		 *  finally    :  예외 발생 여부와 상관없이 무조건 실행
		 */
		
		//  Unhandled exception type FileNotFoundException
		try {
			System.out.println(1);
			FileReader fr = new FileReader("data/a.txt");
			System.out.println(2);
		} catch(FileNotFoundException fnfe) {
			System.out.println(3);
			/*
			// 발생된 예외의 내용 확인하기
			String errMsg = fnfe.getMessage();
			System.out.println(errMsg);
			fnfe.printStackTrace();
			*/
		} finally {
			System.out.println(4);
			System.out.println("무조건 실행...");
		}
	}
}














