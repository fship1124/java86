package annotation.quiz;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class BoardController {
	
	public void test() {}
	

	@RequestMapping(value = "board/list.do")
	public void list() {
		System.out.println("list �޼��� �����");
	}
	
	@RequestMapping(value = "board/write.do")
	public void write() {
		System.out.println("write �޼��� �����");
		
	}
	
}
