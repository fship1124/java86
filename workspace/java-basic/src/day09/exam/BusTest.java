package day09.exam;

class Bus {
	private int Person;	
	static int accRidePerson;

	
	Bus () {
		
	}
	
	
	public int getAccRidePerson() {
		return accRidePerson;
	}

	public int getPerson() {
		return Person;
	}

	public void setPerson(int person) {
		Person = person;
	}

	public void setAccRidePerson(int accRidePerson) {
		this.accRidePerson = accRidePerson;
	}

	
	
	
	//���� ��ȣ
	int no;
	
	Bus (int no) {
		this.no = no;
		System.out.printf("%d�� ���� �������.\n", no);
	}
	
	//���� �Լ�
	void ride (int Person ) {
		this.Person += Person;
		accRidePerson += Person;
		System.out.printf("�°� %d�� ����.\n", Person);
	}
	
	void ride () {
		this.ride(1);
//		accRidePerson += ridePerson;
//		System.out.printf("�°� %d�� ����.\n", ridePerson);
	}
	//���� �Լ�
	void leave (int Person) {
		this.Person -= Person;
		System.out.printf("�°� %d�� ����.\n", Person);
	}
	
	void leave () {
		this.leave(1);
//		accRidePerson -= ridePerson;
//		System.out.printf("�°� %d�� ����.\n", leavePerson);
	}
	//
	
	
	
	
	public String toString() {
		return no + "�� ������ ���� �����ο�:" +this.Person +"��.\n �������� ���� �����ο�:" + accRidePerson +"��";
	}
	
}

public class BusTest {
	public static void main(String[] args) {
		Bus no360 = new Bus(360);
		no360.ride(3);
		no360.leave();
		no360.ride();
		no360.leave(2);
		no360.ride(5);
		no360.leave(3);
		System.out.println(no360);
		
		Bus no740 = new Bus(740);
		no740.ride(2);
		no740.leave(1);
		no740.ride(3);
		no740.leave(2);
		no740.ride(2);
		no740.leave(3);
		System.out.println(no740);
	}
}