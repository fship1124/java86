package day15.quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.omg.Messaging.SyncScopeHelper;

public class Test04 {
    public static void main(String[] args) {
    	
    	
    	// data/a.txt ������ data/aa/bb ���丮��
    	// acopy.txt ���ϸ����� �����Ѵ�.
    	// ����, data/aa/bb ���丮�� �������� �ʴ´ٸ�
    	// �ش� ���丮�� ���� �����ϰ� ������ ������ �����Ѵ�.
    	copy("data/a.txt", "data/aa/bb/acopy.txt");
    	
    	
    	// ������ ��� ��ġ�� ���丮��
    	// ������ ���ϸ����� �����Ų��.
    	// data/aa/bb/a.txt ���Ϸ� ����ȴ�.
    	
    	copy("data/a.txt", "data/aa/bb");
    	
    }
    
    	File f = new File("data/a.txt");              // ������ ����.
    
    	
    static void copy (String copital, String copyPath){          // main �޼ҵ尡 �θ��� �Լ��� static �� �ٴ´�.
    	FileInputStream fr = null;
    	FileOutputStream fw = null;
    	
//    	String path = f.getPath();
    	
    	int sIndex = copital.lastIndexOf("/");
    	String sFileName = copital.substring(sIndex+1);        // ���� ���ϸ�
    	boolean isFile = copyPath.contains(".");               // �������� ���丮���� ���а�

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
    	    long sTime = System.currentTimeMillis();             //long sTime �ð�����
    	   
    	    byte[] buffer = new byte[32 * 1024];            // 1024 = 1k����Ʈ, 2�ǹ���� ����Ѵ�.
    	    
    	    while (true) {
    	    	int a = fr.read(buffer);                // buffer �ٱ��Ͽ� � ��Ҵ��� a�� �ִ´�(���� ����Ʈ ��)
    	    	if (a == -1) break;
    	    	fw.write(buffer, 0, a);         // ���۸� ����Ͽ� 0���� ���� �͸�ŭ a������...
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
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	