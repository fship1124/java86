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
			// 1.7�������� ����. (����Ŭ����)
			// finally ���� �ʾƵ� �ڵ� close()�� ��
			// -try��()�ȿ� ����� IO��ü���� �ڵ� close�� ��
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
			System.out.println("�׽�Ʈ ����");
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
