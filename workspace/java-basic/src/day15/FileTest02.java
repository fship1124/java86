package day15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import day10.pack.a.Data;

public class FileTest02 {
    public static void main(String[] args) {
		File f = new File("data/file.txt");
		
		String path = f.getPath();            // 파일의 전체경로
		String parent = f.getParent();              // 파일의 마지막 경로의 맨 앞
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
		String patern = "yyyy-mm-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(patern);
		System.out.println("파일 수정 시간 : " + sdf.format(d));
		
		System.out.println(f.canRead());           // 파일이 읽기전용
		System.out.println(f.canWrite());           // 파일이 쓰기전용
		
		
		
		
//		
	}
}
