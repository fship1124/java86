package day12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest04 {
	public static void main(String[] args) {
		/*
		 *  ������ ���� ó��...
		try {
			FileReader fr = new FileReader("data/a.txt");
			try {
				fr.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		*/
		/*
		// FileNotFoundException, IOException
		FileReader fr = null;
		try {
			fr = new FileReader("data/a.txt");
		} catch (FileNotFoundException e) {
		}
		// ���ܰ� �߻��ϸ�
		// fr �� null�̴�.
		try {
			fr.read();
		} catch (IOException e) {
		}
		*/
		/*
		try {
			System.out.println(1);
			FileReader fr = new FileReader("data/a.txt");
			fr.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		/*
		try {
			System.out.println(1);
			FileReader fr = new FileReader("data/a.txt");
			fr.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		try {
			System.out.println(1);
			FileReader fr = new FileReader("data/a.txt");
			fr.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}






