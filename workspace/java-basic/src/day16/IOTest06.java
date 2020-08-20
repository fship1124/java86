package day16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest06 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;         // BufferedOutputStream 속도개선을 위해
		
		try {
		   fis = new FileInputStream("data/a.txt");
		   fos = new FileOutputStream("data/a2.txt");
		   // Buffered 속도개선용
		   
		   // 따라서 매개변수에는 기본 (In/out)putStrea을 넣으면 된다.
		   bis = new BufferedInputStream(fis);            // fis를 대상으로 속도개선을 한다
		   bos = new BufferedOutputStream(fos);           // fos를 대상으로 속도를 개선하겠다.
		   
		   
		   
//		   byte[] buffer = new byte[]1024 * 16];             // 바로 위때문에 해당사항이 사용안해도 된다
		   
		   while (true) {
			   int ch = bis.read();
			   if (ch==-1) break;
			   bos.write(ch);
		   }
		   // 버퍼의 내용을 강제로 출력하기 - flush     : Buffered는 항상 가득찰때만 출력하지만 다 채우지 않았음에도 불구하고 끝낼때는 강제로 출력해야하기때문
		   bos.flush();
		   System.out.println("버퍼를 이용한 복사 성공");
		   
		   
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		
			
			try {
				bis.close();   //  버퍼드 클로즈를 반드시 해야 버퍼에 있는 내용이 출력
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try{
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			try{
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
