package day15.quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.omg.Messaging.SyncScopeHelper;

public class Test04 {
    public static void main(String[] args) {
    	
    	
    	// data/a.txt 파일을 data/aa/bb 디렉토리에
    	// acopy.txt 파일명으로 복사한다.
    	// 만약, data/aa/bb 디렉토리가 존재하지 않는다면
    	// 해당 디렉토리를 먼저 생성하고 파일의 내용을 복사한다.
    	copy("data/a.txt", "data/aa/bb/acopy.txt");
    	
    	
    	// 복사할 대상 위치가 디렉토리면
    	// 원래의 파일명으로 복사시킨다.
    	// data/aa/bb/a.txt 파일로 저장된다.
    	
    	copy("data/a.txt", "data/aa/bb");
    	
    }
    
    	File f = new File("data/a.txt");              // 파일을 연다.
    
    	
    static void copy (String copital, String copyPath){          // main 메소드가 부르는 함수는 static 이 붙는다.
    	FileInputStream fr = null;
    	FileOutputStream fw = null;
    	
//    	String path = f.getPath();
    	
    	int sIndex = copital.lastIndexOf("/");
    	String sFileName = copital.substring(sIndex+1);        // 원본 파일명
    	boolean isFile = copyPath.contains(".");               // 파일인지 디렉토리인지 구분값

    	String dfileName = null;
    	String dPath = null;
    	if (isFile == true) {
    		sIndex = copyPath.lastIndexOf("/");
    		dPath = copyPath.substring(0, sIndex);
    		dfileName = copyPath.substring(sIndex+1);
    		
    	} else if (isFile == false) {
    		dPath = copyPath;
    		dfileName = sFileName;
    	}	
    	
    	
    	File f = new File(dPath);
    	
    	if (f.exists() == false) {
    		f.mkdirs();
    	} 
    	
    	File f1 = new File(dPath +"/"+ dfileName); 
    	if (f.exists() == false) {
    		try {
    			f.createNewFile();
				
			} catch (Exception e) {
				e.printStackTrace();
			} 
    	} 
    
    	try {
    		fr = new FileInputStream(copital);
    	    fw = new FileOutputStream(dPath +"/"+ dfileName);
    	    long sTime = System.currentTimeMillis();             //long sTime 시간정보
    	   
    	    byte[] buffer = new byte[32 * 1024];            // 1024 = 1k바이트, 2의배수로 줘야한다.
    	    
    	    while (true) {
    	    	int a = fr.read(buffer);                // buffer 바구니에 몇개 담았는지 a에 넣는다(읽은 바이트 수)
    	    	if (a == -1) break;
    	    	fw.write(buffer, 0, a);         // 버퍼를 사용하여 0부터 읽은 것만큼 a갯수를...
    	    }
		} catch (Exception e) {
			
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
    	
    	
    	
    }   	
    	
} 	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	