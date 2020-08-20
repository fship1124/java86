package day15;

import java.io.FileOutputStream;

public class IOTest04 {
    public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
//			fos = new FileOutputStream("data/file_out.txt");
			fos = new FileOutputStream("data/file_out.txt", true);
			
			fos.write('꽃');
			fos.write(97);
			fos.write('b');   //자동형변환됨 인트는 char 타입을 받을수있다
			fos.write(99);
			fos.write('가');
			
			System.out.println("파일에 내용 출력 완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
