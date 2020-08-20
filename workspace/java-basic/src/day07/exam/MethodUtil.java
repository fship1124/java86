package day07.exam;

import java.util.Scanner;
public class MethodUtil {

	/*
	 * 하나의 문자를 매개변수에 입력받아 
	 * 해당 문자가 대문자이면 true 를 반환하는 isUpperChar(char c) 메소드를 작성
	 * 예> isUpperChar('a') -> false 가 반환됨
	 */
	
	boolean isUpperChar (char c) {
	boolean flag = false;
	if ( 'A' <= c  && c <=  'Z' ) {
		flag = true;

	} else if ( 'a' <= c  && c >= 'z'){
		flag = false;
	}	
	return flag;
	}
	
	/*
	boolean isUpperChar (char c) {
		boolean flag = false;
	    if ( 65 <= c && c >= 90) {
		flag = true;
	    } else if (97 <= c && c >= 122) {
		flag = false;
	    }
	    return flag;
	}
	boolean isUpperChar (char c) {
		boolean flag = false;
	    if ( 65 <= c && c <= 90) {
		flag = true;
	    } else ;
	    
	    return flag;
	}
	 */
	
	
	/*
	 * 하나의 문자를 매개변수에 입력받아 해당 문자가 소문자이면 true를 반환하는 
	 * isLowerChar (char c) 메소드를 작성하시오
	 * 예> isLowerChar('a') -> true 가 반환됨
	 */
	String isLowerChar (char c) {
		return null;
	}
	
	
	
	/*
	 * 두개의 숫자를 매개변수에 입력받아 큰수를 반환하는 
	 * max(int i, int j) 메소드를 작성하시오
	 * 예> max(3,5) -> 5 가 반환됨
	 */
	/*
	int max(int i, int j) {
		if (i > j) ? i : j ;
	}
	reuturn  ;
	
	
	/*
	 * 두개의 숫자를 매개변수에 입력받아 작은수를 반환하는  
	 * min(int i, int j) 메소드를 작성하시오
	 * 예> min(3,5) -> 3 가 반환됨
	 */
	
	
	
	
	/*
	 * 하나의 숫자를 매개변수에 입력받아 절대값을 반환하는   
	 * 메소드를 작성하시오
	 * 예> abs(-3) -> 3, abs(3) -> 3가 반환됨
	 */
	
	
	
	
}

