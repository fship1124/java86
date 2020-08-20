/*
 * switch 구문
 * 
 * 주의 사항
 * 수식자리에는 버전에 따라서 가능한 값들이 정해져 있다.
 * 1.4까지는 byte, short, char, int만 가능함 
 * 1.5에서   Enum 타입이 추가됨
 * 1.7에서   String  타입이 추가됨 
 * 
 * switch (수식) {
 *    case 값1:      수식과 값1이 같다면 아래 실행문장을 수행한다(무조건 같을때밖에 없음)
 *        실행할 문장...;
 *        [break;]   --> switch 블럭을 벗어난다. 
 *    case 값2:      
 *        실행할 문장...;
 *        [break;]   --> switch 블럭을 벗어난다.
 *    default:     case 조건에 맞는게 없을 경우 수행
 *        실행할 문장...;     
 * }
 */

package day03;

import java.util.Random;

public class SwitchTest {
	public static void main(String [] args){
		Random r = new Random();
		int num = r. nextInt(3);    // num : 0 ~ 2 가 나올것이다.
		System.out.println("num : " + num);
		
		switch (num){
		case 0:    // num의 값이 0일경우
			System.out.println("case0 실행함");
			break;
		case 1:    // num의 값이 1일경우
			System.out.println("case1 실행함");
			break;	
		default:
			System.out.println("default 실행함");
		}
		
		String type = "1";
		switch (type) {
		}
	}

}
