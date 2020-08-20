// 객체생성 관리 클래스

package basic1;

public class ApplicationContext {
	public TV getBean(String name) {
		switch (name) {
		case "Samsung" :
			return new SamsungTV();
		case "Sony" :
			return new SonyTV();
		}
		return null;
	}
}
