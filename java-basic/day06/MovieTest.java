/*
 *    영화 정보 등록
 *    
 *    제목 : 비 오는 날
 *    배우 : 주윤발
 *    제목 : 곡성
 *    배우 : 황정민
 *    제목 : 사냥
 *    배우 : 안성기, 조진웅
 *    
 *    입력된 영화 정보
 *    ------------------------
 *    제목       배우
 *    ------------------------
 *    비오는 날  주윤발
 *    곡성       황정민
 *    사냥       조진웅
 *    ------------------------
 */
package day06;

import java.util.Scanner;

class Movie {
	String title;
	String actors;
}
public class MovieTest {
	public static void main(String[] args) {
		Movie[] list = new Movie[3];
		// 배열의 내용 확인
//		System.out.println(Arrays.toString(list));
		Scanner sc = new Scanner(System.in);
		
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
		System.out.println("------------------------------");
		System.out.println("제목\t배우");
		System.out.println("------------------------------");
		for (int i = 0; i < list.length; i++) {
			Movie m2 = list[i];
			System.out.println(
				m2.title + "\t" + m2.actors);
		}
		System.out.println();	
		System.out.println("------------------------------");
	}
}













