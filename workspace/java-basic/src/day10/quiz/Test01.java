package day10.quiz;

class Car {
	String name;
}

public class Test01 {
	public static void main(String[] args) {
		ArrayList list2 = new ArrayList();
		list2.add(new Car());
		
		ArrayList list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		// 만약, get(0) : one
		// 만약, get(2) : three
		String data = (String)list.get(1);     // 묵시적형변환에서 명시적형변환 적용
		
		// two 가 출력되도록 기능 구현
		System.out.println("data :" + data);
		
		int size = list.size();
		// 실행시 size 값은 add 입력된 개수가 반환
		System.out.println("입력된 데이터 크기 : " + size);
		
		
		// two 데이터를 삭제 처리함
		list.remove(1);
	
		// 3이 출력
		size = list.size();
		System.out.println("삭제후 데이터 크기 : " + size);
		
		// [on, three, four]
		System.out.println(list);
		
		
	}

}
