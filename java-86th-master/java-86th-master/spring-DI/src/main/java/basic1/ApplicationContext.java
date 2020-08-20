package basic1;

public class ApplicationContext {
	public TV geBean(String name) {
		switch (name){
		case "Samsung":
			return new SamsungTV();
		case "Sony":
			return new SonyTV();
		}
		return null;
	}
}
