package json;

import java.util.ArrayList;

import com.google.gson.Gson;

public class Test01 {
	private static void test01() {
		Member m = new Member();
		m.setName("홍길동");
		m.setAge(25);
		
		String result = "";
		result += "{";
		result += "\"name\":\"" + m.getName() + "\"";
		result += ",\"age\":\"" + m.getAge() + "\"";
		result += "}";
		System.out.println(result);
	}

	private static void test02() {
		Member m = new Member();
		m.setName("홍길동");
		m.setAge(25);	
		
		Gson gson = new Gson();
		String result = gson.toJson(m);
		System.out.println(result);
	}
	
	private static void test03() {
		Member m = new Member();
		m.setName("홍길동");
		m.setAge(25);	
		ArrayList<String> hobbys = new ArrayList<>();
		hobbys.add("영화감상");
		hobbys.add("음악감상");
		hobbys.add("독서");
		m.setHobbys(hobbys);
		
		Gson gson = new Gson();
		String result = gson.toJson(m);
		System.out.println(result);
	}
	
	private static void test04() {
		Member m = new Member();
		m.setName("홍길동");
		m.setAge(25);	
		ArrayList<String> hobbys = new ArrayList<>();
		hobbys.add("영화감상");
		hobbys.add("음악감상");
		hobbys.add("독서");
		m.setHobbys(hobbys);
		
		Address addr = new Address();
		addr.setPostNo("12345");
		addr.setBasicAddr("서울 특별시 강남구 역삼동");
		addr.setDetailAddr("비트캠프 4층");
		m.setAddr(addr);
		
		Gson gson = new Gson();
		String result = gson.toJson(m);
		System.out.println(result);
	}

	private static void test05() {
		String json = "{\"name\":\"홍길동\",\"age\":25}";
		Gson gson = new Gson();
		Member m = gson.fromJson(json, Member.class);
		System.out.println(m.getName());
		System.out.println(m.getAge());
	}
	
	private static void test06() {
		String json = "{\"name\":\"홍길동\",\"age\":25,\"hobbys\":[\"영화감상\",\"음악감상\",\"독서\"]}";
		Gson gson = new Gson();
		Member m = gson.fromJson(json, Member.class);
		System.out.println(m.getName());
		System.out.println(m.getAge());
		System.out.println(m.getHobbys());
	}
	
	private static void test07() {
		String json = "{'name':'홍길동','age':25,'hobbys':['영화감상','음악감상','독서'],'addr':{'postNo':'12345','basicAddr':'서울시','detailAddr':'비트'}}";
		Gson gson = new Gson();
		Member m = gson.fromJson(json, Member.class);
		System.out.println(m.getName());
		System.out.println(m.getAge());
		System.out.println(m.getHobbys());
		System.out.println(m.getAddr().getPostNo());
		
	}
	
	public static void main(String[] args) {
		// 객체를 json 으로 직접 변환연습
//		test01();
		// 객체를 json 으로 gson 라이브러리 이용
//		test02();
//		test03();
//		test04();
//		test05();
//		test06();
		test07();
	}
	
}




