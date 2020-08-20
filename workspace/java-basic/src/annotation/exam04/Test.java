package annotation.exam04;

@MyTarget   // @Target(ElementType.TYPE)
public class Test {
	@MyTarget   // @Target(ElementType.FIELD)
	private String name;
	@MyTarget  // @Target(ElementType.METHOD)
	public void call() {}
	// @Target(ElementType.PARAMETER)
	public void call(@MyTarget String name) {}
}
