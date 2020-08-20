/**
 *  객체 지향 다형성
 *  - 자바에서 지원하는 형태 3가지 존재
 *  - 1. 오버로딩     2. 오버라이딩     3. 변수의 다형성
 * 
 *  오버로딩 : 
 *  메서드 이름이 같고 매개변수의 타입 또는 개수가 다르다.
 */

package day09;

class Bread {
	
	public void print() {
		System.out.println(1);
	}
	public int print(int i) {
		return i * i;
	}
	
	
	private String name;
	private int price;
	
	// 생성자 - 필수 지켜야 하는 사항
	// 1. 클래스 이름 동일, 2. 반환 타입이 없어야 한다.
	Bread (String n, int p) {
		System.out.println("Bread (String n, int p)");
	}
	
	Bread () {
		System.out.println("Bread ()");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
		System.out.println(1);
		Bread b = new Bread("단팥빵", 2000);
		Bread b2 = new Bread();
		System.out.println(2);
		
	}
}










