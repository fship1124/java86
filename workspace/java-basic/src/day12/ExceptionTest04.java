package day12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest04 {
    public static void main(String[] args) {
    	
    	/* 내포된 예외처리
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
    	// 예외가 발생하면 fr은 null이다.
    	try {
    		fr.read();
    	} catch (IOException e) {
    		
    	} finally {
    	}
    	// 즉 연관이 있다면 지금처럼 분리해서 쓰지 않는다. 완전 최악의 방식
    	*/
    	
    	/*
    	// 권장 첫번째 방식 : 발생 가능한 각 예외에 대해 catch 구문을 각각 생성한다.
    	 
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
    		//다중캐치블락을 사용할 경우에는 부모클래스를 맨 마지막에 위치해야한다. 아니면 부모캐치에서 끝난다.
    	}
	}
}

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	