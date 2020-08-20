package IOTotalExam;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class employeeInfo {
	private String name;
	private int age;
	private String department;
	private String pay;
	private int sum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
}

public class Exam03 {

	public static void main(String[] args) {
		try {
			searchEmployeeInfo("src/exams/employee.txt", "��");
			searchEmployeeInfo("src/exams/employee.txt", "��");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void searchEmployeeInfo(String readFileName, String lastName) throws Exception {
        int count = 0;
		List<employeeInfo> list = new ArrayList();
		employeeInfo ely = new employeeInfo();
		Scanner sc = new Scanner(new File(readFileName));

		System.out.println("======================================================");
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String array[] = line.split(":");

			ely.setName(array[0]);
			ely.setAge(Integer.parseInt(array[1]));
			ely.setDepartment(array[2]);
			ely.setPay(array[3]);

			list.add(ely);
			// System.out.println(list);

			boolean bool = array[0].startsWith(lastName);
			
			
			if (bool == true) {
				System.out.println("�̸� : " + ely.getName() + "\t���� : " + ely.getAge() + "\t�μ� : " + ely.getDepartment()
						+ "\t���� : " + ely.getPay());
				++count;
			}

		}
		System.out.println("======================================================");
		System.out.println(lastName + "�� ���� ���� ȸ���� �� " + count + "�� �Դϴ�.");
	}
}
