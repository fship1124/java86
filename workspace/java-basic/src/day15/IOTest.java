package day15;

import java.io.FileWriter;

public class IOTest {
    public static void main(String[] args) {
		FileWriter fiw = null;
		try {
			fiw = new FileWriter("data/file_out.txt");
			
			fiw.write('²É');
			fiw.write(97);
			fiw.write('b');   
			fiw.write(99);
			fiw.write('°¡');
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fiw.close();
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
	}
}
