
/*
 * 영화 정보 등록
 * 
 * 제목 : 비 오는 날
 * 배우 : 주윤발
 * 제목 : 곡성
 * 배우 : 황정민
 * 제목 : 사냥
 * 배우 : 안성기, 조진웅
 * 
 * 입력된 영화 정보
 * -------------------------
 * 제목       배우
 * -------------------------
 * 비오는 날  주윤발
 * 곡성       황정민
 * 사냥       조진웅
 * -------------------------
 * 
 */
package day06;

import java.util.Scanner;
import java.util.Arrays;

class Movie {           //관련있는 데이타들을 만들기 위해 class 를 생성
	String title;
	String actors;
	}
public class MovieTest {
    public static void main(String[] args) {
		Movie [] list = new Movie[3];  //우리가 만드는것도 데이타 타입이 된다. Movie 타입
		                               //배열은 생성됨과 동시에 초기값이 들어가있다.
	    // 배열의 내용 확인
//		System.out.println(Arrays.toString(list));
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영화 정보 등록");
		for (int i = 0; i < list.length; i++) {
			list[i] = new Movie();
			System.out.print("제목 : ");
			list[i].title = sc.nextLine();
			System.out.print("배우 : ");
			list[i].actors = sc.nextLine();
		}
		
		// 등록된 정보 출력
		System.out.println("입력된 영화 정보");
		System.out.println("----------------------------------");
		System.out.println("제목\t배우");
		System.out.println("----------------------------------");		
        for (int i = 0 ; i < list.length; i++) {
  //      	Movie m = list[i];
  //      	System.out.println(m.title + "\t" + m.actors);   
        	System.out.println(list[i].title + "\t" + list[i].actors);
    	System.out.println();
    	System.out.println("----------------------------------");	       	
        	
        }
    
        
        /*
        System.out.println("영화 정보 등록");
        Movie m = new Movie();
		for (int i = 0; i < list.length; i++) {
			System.out.print("제목 : ");
			m.title = sc.nextLine();
			System.out.print("배우 : ");
			m.actors = sc.nextLine();
			
			list[i] = m;
		}
		
		// 등록된 정보 출력
		System.out.println("입력된 영화 정보");
		System.out.println("----------------------------------");
		System.out.println("제목\t배우");
		System.out.println("----------------------------------");		
        for (int i = 0 ; i < list.length; i++) {
  //      	Movie m = list[i];
  //      	System.out.println(m.title + "\t" + m.actors);   
    	System.out.println();
    	System.out.println("----------------------------------");	
        */   
    
    
    }
    

}
