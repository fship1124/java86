package schema;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class LogAspect  {
	public void showLog(JoinPoint point) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd : HH:mm:ss");
		String fDate = sdf.format(new Date());
		
		System.out.println("호출한 클래스 : " + point.getTarget().getClass().getSimpleName());
		System.out.println("호출한 메서드 : " + point.getSignature().getName());
		System.out.println("호출된 시간 : " + fDate);
	}
}
