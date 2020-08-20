package day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest10 {
	public static void main(String[] args) {
//		FileReader fr = null;
//		BufferedReader br = null;
//		FileWriter fw = null;
//		BufferedWriter bw = null;
		try (                                                       
			// 1.7버전부터 지원. (오토클로즈)
			// finally 쓰지 않아도 자동 close()가 됨
			// -try문()안에 선언된 IO객체들은 자동 close가 됨
				FileReader fr = new FileReader("data/a.txt");
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("data/a3.txt");
				BufferedWriter bw = new BufferedWriter(fw);
		) {
			while (true) {
				int ch = br.read();
				if(ch == -1) break;
				bw.write(ch);
			}
			System.out.println("테스트 성공");
		} catch (Exception e){
			e.printStackTrace();
			
		} 
		/*
		finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		*/
		
		
	}

}
