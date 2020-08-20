package day15.quiz;

import java.io.File;

public class Test02 {
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
		String[] list = f.list();
		for (String name : list) {
			// name 과 연관된 File 클래스 필요
			File sub = new File(f, name);
			String type = "";
			if (sub.isFile()) {
				type = "파일";
			} else if(sub.isDirectory()) {
				type = "디렉토리";
			} 
			System.out.println(type + " : " + name);
			
			/*
			if (sub.isFile()) {
				System.out.println("파일 : " + name);
			} else if(sub.isDirectory()) {
				System.out.println("디렉토리 : " + name);
			} 
			*/
			System.out.println();
		}
	}
}










