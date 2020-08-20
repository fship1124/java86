package schema;

import java.util.Random;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * 실행측정하는 공통기능 클래스
 */
@Component
public class TimeAspect  {
	public Object executeTime(ProceedingJoinPoint pjp) throws Throwable {
		long s = System.currentTimeMillis();
		Random r = new Random();
		for (int i = 0; i< 30; i++) {
			Thread.sleep(r.nextInt(100) + 1);
		}
				
		try {        
	        Object retVal = pjp.proceed();  // 핵심 기능 메서드 호출 
	        return retVal; 
	    } finally {         // Object pjp.getTarget( ) -> 핵심 기능 클래스 
	    	double time = (System.currentTimeMillis() - s) / 1000d;
	    	System.out.println("BOARD걸린시간 : " + time + "초");
	    }
	}
}
