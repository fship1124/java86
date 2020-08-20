package resource;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import jdk.nashorn.internal.ir.annotations.Reference;

public class Menu {
	public Menu() {
		System.out.println("매개변수 없는 기본 생성자");
	}
//	@Resource(name="ham")      // 이름으로 매칭후 주임
	@Resource				// 타입으로 매칭해라
	private ISand sand;
	
	public void setSand(ISand sand) {
		this.sand = sand;
	}

	public void info() {
		sand.info();
	}
}
