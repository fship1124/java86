package basic3;

public class ProxyController implements Controller {
	
	private Controller controller;
	public ProxyController(Controller controller) {
		this.controller = controller;
	}
	
	@Override
	public void execute() throws Exception {
		Class<?> clz = controller.getClass();
		
		long s = System.currentTimeMillis();
		controller.execute();
		double time = (System.currentTimeMillis() - s) / 1000d;
		System.out.println(clz.getSimpleName() + " 실행 시간 : " + time );
	}

}
