/*
 * 		아래의 프로그램 작성 시
 * 		추천 방식
 * 		1. test01.txt 파일의 데이터를 담을 수 있는 
 *    	   Drink 클래스 객체 선언
 * 		2. 최초 프로그램 로딩 시 Drink 배열을 생성하여
 *    	   test01.txt 파일의 내용을 읽어서 배열에 정보를 설정함
 * 		3. 사용자가 반복하면서 메뉴 정보를 요청시에는
 *         최초 로딩된 배열에서 정보를 추출하여 사용함
 *    
 *   	//공통 작업 사항
 *    	메인 클래스와 작업 진행 클래스 분리
 *    	Test01.java		-메인 클래스
 *      DrinkServicr    -관리 프로그램 처리..
 *      
 *      기능별로 메서드를 분리한다.
 *    
 * 
 * 음료관리 프로그램
 * 
 * -------------------------------------
 * 1. 전체조회
 * 2. 가격조회
 * 3. 칼로리조회
 * 4. 종료
 * -------------------------------------
 * 메뉴 선택 : 1
 * 
 * ----------------------------------------
 * 음료		가격		칼로리
 * ----------------------------------------
 * 콜라		1500		237
 * 사이다	1400		330
 * 환타		1600		325
 * 
 * -------------------------------------
 * 1. 전체조회
 * 2. 가격조회
 * 3. 칼로리조회
 * 4. 종료
 * -------------------------------------
 * 메뉴 선택 : 2
 * 
 * 가격 : 1500
 *----------------------------------------
 * 음료		가격		칼로리
 * ----------------------------------------
 * 콜라		1500		237
 * 사이다	1400		330
 * 
 * -------------------------------------
 * 1. 전체조회
 * 2. 가격조회
 * 3. 칼로리조회
 * 4. 종료
 * -------------------------------------
 * 칼로리 선택 : 3
 * 
 * 칼로리 : 300
 *----------------------------------------
 * 음료		가격		칼로리
 * ----------------------------------------
 * 사이다	1400		330
 * 환타		1600		325
 * 
 * -------------------------------------
 * 1. 전체조회
 * 2. 가격조회
 * 3. 칼로리조회
 * 4. 종료
 * -------------------------------------
 */

package day08.exam;

import java.io.FileNotFoundException;

public class Test01 {
	public static void main(String[] args) throws FileNotFoundException {
		
		DrinkServicr ds = new DrinkServicr();
		ds.start();
		
 	
	}
}
