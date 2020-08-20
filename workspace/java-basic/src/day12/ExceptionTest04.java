package day12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest04 {
    public static void main(String[] args) {
    	
    	/* ������ ����ó��
    	try {
		    FileReader fr = new FileReader("data/a.txt");
		    try {
		    fr.read();
		    } catch (IOException e) { 
		    	e.printStackTrace();
		    }
    	} catch (FileNotFoundException fnfe) {
    		fnfe.printStackTrace();
    	} finally {
    	}
    	*/
    	
    	/*
    	// FileNotFoundException, IOException
    	FileReader fr = null;
    	try {
    		fr = new FileReader("data/a.txt");
    	} catch (FileNotFoundException fnfe) {
    		fnfe.printStackTrace();
    	}
    	// ���ܰ� �߻��ϸ� fr�� null�̴�.
    	try {
    		fr.read();
    	} catch (IOException e) {
    		
    	} finally {
    	}
    	// �� ������ �ִٸ� ����ó�� �и��ؼ� ���� �ʴ´�. ���� �־��� ���
    	*/
    	
    	/*
    	// ���� ù��° ��� : �߻� ������ �� ���ܿ� ���� catch ������ ���� �����Ѵ�.
    	 
    	try {
    		fr = new FileReader("data/a.txt");
    	    fr.read();
        } catch (FileNotFoundException fnfe) {
    	    fnfe.printStackTrace();
        } catch (IOException e) {
    	    e.printStackTrace();
    	}   
    	 */
    	
    	try {
    		System.out.println(1);
    		FileReader fr = new FileReader("data/a.txt");
    		fr.read();
    	} catch (FileNotFoundException e)	{
    		e.printStackTrace();
    	} catch (IOException e) {
    		e.printStackTrace();
    		//����ĳġ����� ����� ��쿡�� �θ�Ŭ������ �� �������� ��ġ�ؾ��Ѵ�. �ƴϸ� �θ�ĳġ���� ������.
    	}
	}
}

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	