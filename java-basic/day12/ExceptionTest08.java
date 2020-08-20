package day12;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest08 {
	private static void a() throws FileNotFoundException{
		try {
			FileReader fr = new FileReader("data/a.txt");
		} catch (Exception e) {
			System.out.println("抗寇狼 流立 贸府 备巩 角青");
			throw new FileNotFoundException(e.getMessage());
		}
	}
	public static void main(String[] args) {
		try {
			a();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
