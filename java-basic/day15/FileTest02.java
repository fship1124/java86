package day15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest02 {
	public static void main(String[] args) {
		File f = new File("data/file.txt");
		
		String path = f.getPath();
		String parent = f.getParent();
		String name = f.getName();
		System.out.println("path : " + path);
		System.out.println("parent : " + parent);
		System.out.println("name : " + name);
		
		boolean result = f.isFile();
		System.out.println(result ? "파일" : "파일 아님");
		result = f.isDirectory();
		System.out.println(result ? "디렉토리" : "디렉토리 아님");
		
		// 파일의 크기 : byte
		long size = f.length();
		System.out.println(size);
		
		long modTime = f.lastModified();
		Date d = new Date(modTime);
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println("파일 수정 시간 : " + sdf.format(d));
		
		System.out.println("읽기 가능 : " + f.canRead());
		System.out.println("쓰기 가능 : " + f.canWrite());
	}
}








