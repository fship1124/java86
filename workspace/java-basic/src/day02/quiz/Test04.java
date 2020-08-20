/*
 * 아래의 코드를 오류가 발생하지 않도록 코드를 변경한다.
 * 단, i에 100을 입력하는 코드는 try 문에서 실행해야 한다.
 */

package day02.quiz;

public class Test04 {
	public static void main(String [] args){
		
		// local variable : 지역변수(값을 초기화 해야지만 사용할 수 있다. 값을 넣어준다는 의미)
		// 메서드 안에서 선언된 변수
		int i = 0;
		try {
		
		    i = 100; 
		}
		catch (Exception e){
			
		} finally {
			System.out.println(i);
		}
	}

}
