package basic03;

import java.util.Random;

public class ProxyController implements Controller {
	private Controller controller;
	public ProxyController(Controller controller) {
		this.controller = controller;
	}
	
	@Override
	public void execute() throws Exception {
		long s = System.currentTimeMillis();
		Random r = new Random();
		for (int i = 0; i< 30; i++) {
			Thread.sleep(r.nextInt(100) + 1);
		}
		controller.execute();
		double time = (System.currentTimeMillis() - s) / 1000d;
		System.out.println(controller.getClass().getSimpleName() + "걸린시간 : " + time + "초");
	}
	
}
