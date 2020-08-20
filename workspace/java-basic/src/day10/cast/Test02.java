package day10.cast;

public class Test02 {
    public static void main(String[] args) {
//		Animal a = new Cat();
//		Animal a = new Dog();
		Animal a = new Animal();           //묵시적형변환
		Dog d = (Dog)a;                    //명시적형변환 - 묵시적형변환한 객체를 명시적으로 쓰고싶을때 확장해서 사용할때
	}
}
