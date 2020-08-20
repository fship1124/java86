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

	
	
	
	//버스 번호
	int no;
	
	Bus (int no) {
		this.no = no;
		System.out.printf("%d번 버스 운행시작.\n", no);
	}
	
	//승차 함수
	void ride (int Person ) {
		this.Person += Person;
		accRidePerson += Person;
		System.out.printf("승객 %d명 승차.\n", Person);
	}
	
	void ride () {
		this.ride(1);
//		accRidePerson += ridePerson;
//		System.out.printf("승객 %d명 승차.\n", ridePerson);
	}
	//하차 함수
	void leave (int Person) {
		this.Person -= Person;
		System.out.printf("승객 %d명 하차.\n", Person);
	}
	
	void leave () {
		this.leave(1);
//		accRidePerson -= ridePerson;
//		System.out.printf("승객 %d명 하차.\n", leavePerson);
	}
	//
	
	
	
	
	public String toString() {
		return no + "번 버스의 현재 승차인원:" +this.Person +"명.\n 모든버스의 누적 승차인원:" + accRidePerson +"명";
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