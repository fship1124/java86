package annotation.quiz;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class BoardController {
	
	public void test() {}
	

	@RequestMapping(value = "board/list.do")
	public void list() {
		System.out.println("list 메서드 실행됨");
	}
	
	@RequestMapping(value = "board/write.do")
	public void write() {
		System.out.println("write 메서드 실행됨");
		
	}
	
}
