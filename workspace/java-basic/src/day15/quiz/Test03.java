package day15.quiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;

import org.omg.Messaging.SyncScopeHelper;

public class Test03 {
    public static void main(String[] args) {
		// 파일 복사 하기
    	// data/file.txt -> data/file_copy.txt
    	
    	
    	
    	FileInputStream fr = null;
    	FileOutputStream fw = null;
    	
    	try {
    	    fr = new FileInputStream("data/a/test.avi");
    	    fw = new FileOutputStream("data/test.avi");
    	    long sTime = System.currentTimeMillis();             //long sTime 시간정보
    	    while (true) {
    	    	int a = fr.read();
    	    	if (a == -1) break;
    	    	fw.write(a);
    	    }
    	    double time = (System.currentTimeMillis() - sTime) / 1000d;   //1000d를 붙이면 더블형이됨
    	    System.out.println("파일에 걸린 시간(초) : " + time);
		} catch (Exception e) {
			
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
    	
    	
        /*
    	FileReader fr = null;
    	FileWriter fw = null;
    	
    	try {
    	    fr = new FileReader("data/a/test.avi");
    	    fw = new FileWriter("data/test.avi");
    	    long sTime = System.currentTimeMillis();             //long sTime 시간정보
    	    while (true) {
    	    	int a = fr.read();
    	    	if (a == -1) break;
    	    	fw.write(a);
    	    }
    	    double time = (System.currentTimeMillis() - sTime) / 1000d;   //1000d를 붙이면 더블형이됨
    	    System.out.println("파일에 걸린 시간(초) : " + time);
		} catch (Exception e) {
			
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
    	*/
	}
}
