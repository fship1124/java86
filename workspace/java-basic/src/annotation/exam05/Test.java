package annotation.exam05;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) throws Exception{
		
		Class<?> clz = AnnoApply.class;
		
		Method method = clz.getDeclaredMethod("info");
		RuntimeAnno2 anno2 =  method.getAnnotation(RuntimeAnno2.class);
		System.out.println("id : " + anno2.id());
		System.out.println("msg : " + anno2.msg());
		/* 
		// 클래스에 선언된 특정 어노테이션 가져오기
		RuntimeAnno1 anno1 = clz.getAnnotation(RuntimeAnno1.class);
		ClassAnno anno2 = clz.getAnnotation(ClassAnno.class);     // 실행시점 참조할 수 없으므로 null
		
		System.out.println(anno1 + "," + anno1.value());
		System.out.println(anno2);
		 */
		
		/*
		// 전체 설정된 어노테이션 확인
		Annotation[] annoArr = clz.getAnnotations(); 	// 클래스 위쪽의 정보: clz.getAnnotations()
		System.out.println("class 에 선언된 어노테이션");
		for (Annotation anno : annoArr) {
			System.out.println(anno);
			System.out.println( ((RuntimeAnno1)anno).value() );
			
		}
		System.out.println("================");
		 */
	}
}
