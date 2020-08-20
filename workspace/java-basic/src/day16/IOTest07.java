package day16;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// 2차 스트림 클래스 
public class IOTest07 {
	public static void main(String[] args) {
		// BufferdeReader, BufferdeWriter
		// 1차 스트림 클래스
		FileInputStream fr = null;
		FileOutputStream fw = null;
		// 2차 스트림 클래스
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileInputStream("data/a.txt");
			fw = new FileOutputStream("data/a3.txt");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			while (true) {
				int ch = br.read();
				if (ch==-1) break;
				bw.write(ch);
			}
			System.out.println("버퍼를 이용한 복사 성공");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
