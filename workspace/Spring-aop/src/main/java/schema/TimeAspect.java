package schema;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 실행시간을 측정하는 공통기능 클래스
 * @author backup5
 *
 */
public class TimeAspect {
	// 핵심기능 클래스의 메서드를 호출하기 위한 매개변수
	// 예외가 발생되면 그냥 넘어가라
	public void executeTime(ProceedingJoinPoint pjp) throws Throwable {
		long s = System.currentTimeMillis();
		
		try {
			// 핵심기능의 메서드를 호출하라
			Object reVal = pjp.proceed();
		} finally {
			double time = (System.currentTimeMillis() - s) / 1000d;
			System.out.println("실행시간 : " + time);
		}
		
	}
}
