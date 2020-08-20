package day15;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
    	// File() 디렉토리도 가능함.
    	File f = new File("data/a/b/c");   
    	// f.mkdir(); 디렉토리를 생성해준다.(없을경우에만, 있을경우에는 불가) - 상위폴더도 연달아서 없을경우 생성불가
    	// f.mkdirs(); 디렉토리를 생성해준다.(없을경우에만, 있을경우에는 불가) - 상위폴더도 연달아서 없을경우 생성가능
    	
    	
//    	System.out.println(f.mkdir() ? "디렉토리 생성" : "디렉토리 실패");  //mkdir 반환값이 boolean형임
    	System.out.println(f.mkdirs() ? "디렉토리 생성" : "디렉토리 실패");  //mkdir 반환값이 boolean형임
		
    	
    	
    	
    	
    	/*파일 생성 삭제================================================
    	File f = new File("data/file.txt");            //존재하지 않는 파일도 입력할수 있음 false로 반환됨
//		System.out.println(f.exists());
		if(f.exists()) {                     //f.exists() 파일이 있는지 없는지 확인
			// 파일 존재시 파일 삭제하기
           f.delete();	
           System.out.println(f.delete() ? "파일생성" : "생성실패");;
		}
		else {
			try {
				System.out.println(f.createNewFile() ? "파일생성" : "생성실패");  //createNewFile 반환값이 boolean형임
			} catch (IOException e) {
				System.out.println("파일생성 실패");
				e.printStackTrace();
			}
		}
		*/
    	
    
    	
// ====================================================================================   	
    	
//    	f.createNewFile           파일생성(createNewFile 은 반환값이 boolean형임)
//      f.exists() 파일이 있는지 없는지 확인    	
    
    	
    	
    	
	}
}















