package day15.quiz;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileUtil {
	public static boolean mkDir() {
		// ���� �ð� ������ ����
		// �� �� �Ͽ� �ش��ϴ� ���丮�� �����Ѵ�.
		// ��> 2016-07-15 
		//     data/2016/07/15 �� ����
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







