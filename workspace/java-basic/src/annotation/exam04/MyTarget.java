package annotation.exam04;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import javax.lang.model.element.Element;

//@Target(ElementType.TYPE)	// 클래스(인터페이스, Enum..) 위쪽에 선언
//@Target(ElementType.METHOD)	// 메서드선언부에서만 사용가능
//@Target(ElementType.FIELD)	// 멤버변수 위쪽에 선언
//@Target(ElementType.PARAMETER)	// 파라미터 앞쪽에 선언
//@Target({ElementType.TYPE, ElementType.METHOD})	// 중복으로 사용하고 싶을 경우
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})	// 중복으로 사용하고 싶을 경우

public @interface MyTarget {}
