// 어노테이션이 적용된 클래스
package annotation.exam05;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@ClassAnno(value="클래스 설정")		// 실행할때 참조할 수 없음
//@RuntimeAnno1(value="런타임 설정") 속성명을 default로 줌
@RuntimeAnno1("런타임 설정")          // 실행할때 참조할 수 있는것 @Retention(RetentionPolicy.RUNTIME)
public class AnnoApply {
	@RuntimeAnno2(id="tester", msg="Hi~~")
	public void info() {}
}
