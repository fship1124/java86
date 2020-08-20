package day13.generic;

public class BoxTest02 {
    public static void main(String[] args) {
		Box2<String> box = new Box2<String>();   //Generic 타입을 String으로 
		box.setData("문자열");
//		box.setData(100);       //컴파일 오류
		String value = box.getData();
		System.out.println(value);
	}
}
