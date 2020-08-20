package day10;

class Parent /* extends java.lang.Object */{      //기본으로 최상의 부모(Object)가 생성이 된다. Object는 모든 클래스의 부모클래스다.
	Parent() {}
	Parent(int i) {
		
	}
}

class Child extends Parent {
	Child () {
		super();
	}
}

public class ExtendsTest {
	public static void main(String[] args) {
		
	}

}
