package day16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class IOTest11 {
	public static void main(String[] args) {
		try (
			FileWriter fw = new FileWriter("data/a4.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);	
		) {
			pw.println(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
