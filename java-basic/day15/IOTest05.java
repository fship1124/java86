package day15;

import java.io.FileWriter;
import java.io.IOException;

public class IOTest05 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data/file_out.txt");
			fw.write('꽃');
			fw.write(97);
			fw.write('b');
			fw.write(99);
			fw.write('가');
			System.out.println("파일에 내용 출력 완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}






