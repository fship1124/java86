/*
 * 리플렉션
 * 1. 클래스 정보 접근
 * 2. 메서드 접근
 * 3. 객체 생성
 * 4. 메서드 실행
 */
package reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;

public class ReflectionTest {
	/** 
	 * 1. 클래스 객체 정보를 얻는 방법 : 3가지
	 */
	private static void test01() throws Exception{
		// 1. 클래스 이름. class : 클래스의 static 필드인 class 이용
		// ? : 모든타입을 다 받을수 있다는 뜻
		// area에 올라가있는 클래스 정보를 볼수 있다.(1번만)
		Class<?> clz = Dog.class;
		
		// 2. Class.forName("패키지명.클래스명") : 문자열을 받았을 경우 사용
		Class<?> clz2 = Class.forName("reflection.Dog");
		
		//clz, clz2 주소가 같음(같은 공간 보고있음):area에 올라가있는 클래스 정보
	
		// 3. 객체.getClass() 메서드 활용
		Dog d = new Dog();
		Class<?> clz3 = d.getClass();
		
		System.out.println(clz == clz2);
		System.out.println(clz2 == clz3);
	
		// 클래스 이름을 꺼내오는 방법 2가지
		// getSimpleName: 패키지명을 제외한 full 네임
		System.out.println(clz.getSimpleName());
		// getName : 패키지를 포함한 full 네임
		System.out.println(clz.getName());
		
	}
	
	/**
	 *  2. Class 의 메서드 정보 접근하는 방법
	 */
	private static void test02() throws Exception {
		Class<?> clz = Dog.class;
		Method[] mArr = clz.getDeclaredMethods();
		System.out.println("메서드 정보 출력");
		System.out.println("=========================================");
		for (Method method: mArr) {
			System.out.println("메서드 이름 : " + method.getName());
			Class<?> rClz = method.getReturnType();
			System.out.println("반환타입 이름 : " + rClz.getName());
			// 파라미터 정보 추출
			Parameter[] p = method.getParameters();
			for (Parameter param : p) {
				Type t = param.getParameterizedType();
				System.out.println("파라미터 : " + t.getTypeName());
			}
			System.out.println("=========================================");
		}
		/* 첫번째 
		Method method = clz.getDeclaredMethod("setName", String.class);
		System.out.println("메서드 정보 출력");
		System.out.println("=========================================");
		System.out.println("메서드 이름 : " + method.getName());
		Class<?> rClz = method.getReturnType();
		System.out.println("반환타입 이름 : " + rClz.getName());
		// 파라미터 정보 추출
		Parameter[] p = method.getParameters();
		for (Parameter param : p) {
			Type t = param.getParameterizedType();
			System.out.println("파라미터 : " + t.getTypeName());
		}
		System.out.println("=========================================");
		*/
		
	}
	
	/**
	 * 3. 리플렉션을 이용한 객체 생성
	 */
	private static void test03() throws Exception {
		Class<?> clz = Dog.class;
		
		// 새로운 인스턴스를 만들어라. 디폴트 생성자를 통해 객체를 만든다.
		Object obj = clz.newInstance();    // Object obj = new Dog();
		Dog dog = (Dog)obj;
		dog.setName("쫑");
		System.out.println(dog.getName());
		
	}
	
	/**
	 * 4. 리플렉션을 이용한 메서드 실행
	 */
	
	private static void test04() throws Exception {
		/*
		 * 	Dog d = new Dog();
		 * 	d.setName("쫑");
		 * 	String name = d.getName();
		 *  system.out.println("강아지의 이름 : " + name);
		 */
		Class<?> clz = Dog.class;
		Object obj = clz.newInstance();
		Method m1 = clz.getDeclaredMethod("setName", String.class);
		// obj 와 m1 를 묶어서 메서드 실행(d.setName("쫑");)
		m1.invoke(obj, "쫑");
		
		// String name = d.getName();
		Method m2 = clz.getDeclaredMethod("getName");
		String name = (String)m2.invoke(obj);
		System.out.println("강아지의 이름 : " + name);
	}
	
	
	public static void main(String[] args) throws Exception {
//		test01();
//		test02();
//		test03();
		test04();
		
		// 
		sum();
		sum(100);
		sum(100, 200);
		sum(new int[] {100, 200, 300});
		sum(new int[] {100, 200, 300, 400});
		
	}

	// 동적으로 모든 매개변수를 받을수 있음
	private static void sum(int...arr) {}
	/*
	private static void sum() {}
	private static void sum(int i) {}
	private static void sum(int i, int j) {}
	private static void sum(int [] arr) {}
	*/
}
