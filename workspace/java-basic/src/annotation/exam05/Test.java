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
		// Ŭ������ ����� Ư�� ������̼� ��������
		RuntimeAnno1 anno1 = clz.getAnnotation(RuntimeAnno1.class);
		ClassAnno anno2 = clz.getAnnotation(ClassAnno.class);     // ������� ������ �� �����Ƿ� null
		
		System.out.println(anno1 + "," + anno1.value());
		System.out.println(anno2);
		 */
		
		/*
		// ��ü ������ ������̼� Ȯ��
		Annotation[] annoArr = clz.getAnnotations(); 	// Ŭ���� ������ ����: clz.getAnnotations()
		System.out.println("class �� ����� ������̼�");
		for (Annotation anno : annoArr) {
			System.out.println(anno);
			System.out.println( ((RuntimeAnno1)anno).value() );
			
		}
		System.out.println("================");
		 */
	}
}
