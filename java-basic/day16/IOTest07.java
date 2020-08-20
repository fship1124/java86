package day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest07 {
	public static void main(String[] args) {
		// BufferedReader, BufferedWriter
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader("data/a.txt");
			fw = new FileWriter("data/a2.txt");
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			while (true) {
				int ch = br.read();
				if (ch == -1) break;
				bw.write(ch);
			}
			System.out.println("���۸� �̿��� ���� ����");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			try {
				bw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
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
