package annotation.exam02;

@Marker                        
public class test {
	// Single value �� ���:  
	// �Ӽ����� value �� ��� ������ ������
	@Type1(value="test")               // �Ӽ��� ��� ��(�̸�=��ȯ��)
	@Type2(name="test")
	public void call() {}
	
	@Type1("test")               // �Ӽ��� ��� ��(�̸�=��ȯ��)
//	@Type2("test")
	public void call2() {}
	
}
