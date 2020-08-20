package day15.quiz;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import day10.pack.a.Data;

public class FileUtil {
    public static boolean mkDir() {
    	// 현재 시간 정보를 얻어와
    	// 년 월 일에 해당하는 디렉토리를 생성한다.
    	// 예> 2016-07-15
    	//     data/2016/07/15 로 생성
    	
    	/*강사님 1
    	SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd");
    	File f = new File("data" + sdf.format(new Date()));
    	return f.mkdirs();
    	*/
    	
    	//강사님2
    	return new File("data" + new SimpleDateFormat("/yyyy/MM/dd"). format(new Date())).mkdirs();
    	
    	
    	
    	/*허접 효순 하다 맘
    	Calendar c =  Calendar.getInstance();
    	System.out.println(c);
    	
    	int year = c.get(Calendar.YEAR);
    	int month = c.get(Calendar.MONTH);
    	int day = c.getMaximum(Calendar.DATE);
    	
    	File f = new File()
    	System.out.println(f.exists());
    	
    	if (f.exists()) {
    		
    	}
//    	File f = new File("data/%d/%d/%d", year, month, day); 
    	
    	System.out.println(f.mkdirs() ? "디렉토리 생성" : "디렉토리 실패");
    	
    	return false;
    	*/
    }
}
