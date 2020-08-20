package day15;

import java.io.File;

public class FileTest03 {
    public static void main(String[] args) {
		File f = new File("data");
		String [] list = f.list();                     //f.list();         f가 가리키는 파일의 해당폴더 안의 "data"정보(이름)를 가져온다.
		
		for (String name : list) {
			System.out.println(name);
		}
		System.out.println("=====================");
		
		File[] fList = f.listFiles();
		for (File fSub : fList) {
			System.out.println(fSub.isDirectory());
			System.out.println(fSub.isFile());
			System.out.println(fSub.getName());
		
		}
		
	}
}
