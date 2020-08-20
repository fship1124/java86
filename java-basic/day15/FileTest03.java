package day15;

import java.io.File;

public class FileTest03 {
	public static void main(String[] args) {
		File f = new File("data");
		String[] list = f.list();
		for (String name : list) {
			System.out.println(name);
		}
		
		File[] fList = f.listFiles();
		for (File fSub : fList) {
			System.out.println(fSub.isDirectory());
			System.out.println(fSub.isFile());
			System.out.println(fSub.getName());
		}
	}
}











