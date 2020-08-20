package annotation.exam02;

@Marker                        
public class test {
	// Single value 일 경우:  
	// 속성명이 value 인 경우 생략이 가능함
	@Type1(value="test")               // 속성을 줘야 함(이름=반환값)
	@Type2(name="test")
	public void call() {}
	
	@Type1("test")               // 속성을 줘야 함(이름=반환값)
//	@Type2("test")
	public void call2() {}
	
}
