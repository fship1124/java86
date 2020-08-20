package day15.quiz;

import java.io.File;

public class Test0201 {
	public static void main(String[] args) {
		// data 디렉토리 하위의 파일들의 정보를 아래와 같이 출력
		/*
		 *   출력형식 >
		 *   
		 *   디렉토리 : a
		 *   파일 : a.txt
		 *   파일 : file.txt
		 */
		File f = new File("data");
		File[] list = f.listFiles();
		for (File sub : list) {
			String type = "";
			if (sub.isFile()) {
				type = "파일";
			} else if(sub.isDirectory()) {
				type = "디렉토리";
			} 
			System.out.println(type + " : " + sub.getName());
		}
	}
}










