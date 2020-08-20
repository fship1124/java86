package day15;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		File f = new File("data/a/b/c");
		
		System.out.println(
				f.mkdirs() ? "디렉토리 생성" : "생성 실패");
		/*
		System.out.println(
				f.mkdir() ? "디렉토리 생성" : "생성 실패");
		*/
		
		
		/*
		File f = new File("data/file.txt");
//		System.out.println(f.exists());
		if (f.exists()) {
			// 파일 존재시 파일 삭제하기
			System.out.println(
					f.delete() ? "파일 삭제" : "파일 삭제 실패");
		}
		else {
			try {
				System.out.println(
						f.createNewFile() ? "파일 생성" : "생성 실패");
			} catch (IOException e) {
				System.out.println("파일 생성 실패");
				e.printStackTrace();
			}
		}
		*/
	}
}





