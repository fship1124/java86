
/*
 * 기본형 값의 쓰기와 읽기
 * DaataInputStream, DataOutputStream         // 자체가 데이터를 잘라서 쓰는 타입
 */
package day16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.imageio.stream.FileCacheImageInputStream;

public class IOTest08 {
	private static void writeData() throws Exception {
		FileOutputStream fos = new FileOutputStream("data/b.txt"); 
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeInt(100);          //4바이트
		dos.writeChar('가');        // 2바이트
		dos.writeDouble(1.1);       //8바이트         ->바이트를 쪼개서 썼다. DataOutput를 통해서 쪼갠 데이타를 읽는다.
		dos.writeUTF("안녕하세요");   // UTF-8 모든언어(다국어 공용)를 다룰수있음
		dos.close();
		fos.close();
	}		
	
	private static void readData() throws Exception {
		FileInputStream fis = new FileInputStream("data/b.txt"); 
		DataInputStream dis = new DataInputStream(fis);
		
		int i = dis.readInt();          //4바이트 
		char c = dis.readChar();        // 2바이트
		double d = dis.readDouble();       //8바이트         ->바이트를 쪼개서 썼다. DataOutput를 통해서 쪼갠 데이타를 읽는다.
	    String str = dis.readUTF();       //utf8 방식의 처리
		dis.close();
		fis.close();
		
		System.out.println("i : " +i);
		System.out.println("c : " +c);
		System.out.println("d : " +d);
		System.out.println("str : " +str);
		
		
//    	fos.write(97);          //인트값을 표현하기위해서는 4바이트를 사용.
//    	fos.write('가');        //한글은 2바이트라서 제대로 전달되지 못해 출력불가.
//		fos.write('a');         //write에는 
//		fos.write(97);          //정수에 해당하는 아스키코드값의 문자 a 출력
//		fos.close();
		
	}
    public static void main(String[] args) throws Exception {
    	writeData();
    	readData();
    	System.out.println("테스트 완료");
	}
}
