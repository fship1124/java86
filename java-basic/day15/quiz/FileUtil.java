package day15.quiz;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileUtil {
	public static boolean mkDir() {
		// 현재 시간 정보를 얻어와
		// 년 월 일에 해당하는 디렉토리를 생성한다.
		// 예> 2016-07-15 
		//     data/2016/07/15 로 생성
		/*
		SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd");
		File f = new File("data" + sdf.format(new Date()));
		return f.mkdirs();
		*/
		return new File("data" + 
		                new SimpleDateFormat("/yyyy/MM/dd").
		                format(new Date())).mkdirs();
	}
}







