package schema;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;


public class LogAspect {
	// JoinPoint -> 어떤 핵심기능 클래스의 어떤 메서드인지 정보를 추출
    // 	 			메소드들에 대한 추가정보
	public void showLog(JoinPoint point) {
		// Target:핵심포인트
		Object target = point.getTarget();
		Class<?> clz = target.getClass();
		// 클래스명
		String targetName = clz.getName();
		
		// 메소드에 대한 정보
		Signature sign = point.getSignature();
		// 메소드명
		String methodName = sign.getName();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String fDate = sdf.format(new Date());
		System.out.println("-----------------------------------");
		System.out.println("클래스명 : " + targetName);
		System.out.println("메서드명 : " + methodName);
		System.out.println("호출된 시간 : " + fDate);
		System.out.println("-----------------------------------");
	}
}
