package day03.quiz;

import java.util.Random;
public class Test01 {
	public static void main(String [] args){
		/*
		 * 랜덤한 숫자생성(1~12)
		 * 생성된 숫자에 따라서 아래와 같은 출력이 되도록 코드 작성
		 * 
		 * 12, 1, 2 라면 "겨울입니다" 출력
		 * 3, 4, 5 라면 "봄입니다" 출력
		 * 6, 7, 8 라면 "여름입니다" 출력
		 * 9, 10, 11 라면 "가을입니다" 출력
		 * 
		 * switch 문을 활용한다.
		 */
		
		
		Random r = new Random();
		int num = (r.nextInt(12)+1);
		
		System.out.println(num);
		
		/*
		switch(num){
		case 12 : 
		case 1 :
		case 2 :
			System.out.println("겨울입니다");	
		break;
		
		case 3 : 
		case 4 :
		case 5 :
			System.out.println("봄입니다");	
		break;
		
		case 6 : 
		case 7 :
		case 8 :
			System.out.println("여름입니다");	
		break;
		
		case 9 : 
		case 10 :
		case 11 :
			System.out.println("가을입니다");	
		// default :  //나머지 값
		//	System.out.println("가을입니다");				
		break;
		}
		*/
		
		
		String msg = "";
		switch(num){
		case 12 : case 1 :case 2 :
			msg = "겨울";	
		break;
		
		case 3 : case 4 :case 5 :
			msg = "봄";	
		break;
		
		case 6 : case 7 :case 8 :
			msg = "여름";	
		break;
		
		case 9 : case 10 :case 11 :
			msg = "가을";	
		// default :  //나머지 값
		//	System.out.println("가을입니다");				
		break;
		}
		System.out.println(msg + "입니다.");
	    
	}
}
