/*
 * WebToon.java
 * WebToonUI.java
 * WebToonDAO.java
 * WebToonService.java
 * 
 * 출력형식 >
 * 웹튠 관리 프로그램
 * ------------------------------
 * 1. 전체조회
 * 2. 작가조회
 * 3. 장르조회
 * 4. 평점조회
 * 5. 제목조회
 * 6. 종료
 */


package day14.quiz;

import java.io.FileNotFoundException;

public class WebToonTest {
    public static void main(String[] args) throws FileNotFoundException {
    	WebToonUI ui = new WebToonUI();
    	ui.start();
	}
}
