package day15.quiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		// 파일 복사 하기
		// data/file.txt -> data/file_copy.txt
		FileInputStream fr = null;
		FileOutputStream fw = null;
		try {
			fr = new FileInputStream("data/test.avi");
			fw = new FileOutputStream("data/test_copy2.avi");
			
			long sTime = System.currentTimeMillis();
			while (true) {
				int ch = fr.read();
				if (ch == -1) break;
				fw.write(ch);
			}
			double time = (System.currentTimeMillis() - sTime) / 1000d;
			System.out.println("복사에 걸린 시간(초) : " + time);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}









