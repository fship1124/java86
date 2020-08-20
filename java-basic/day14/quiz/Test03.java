package day14.quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Test03Data {
	private String name;
	private int score;
	public Test03Data() {
		super();
	}
	public Test03Data(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
public class Test03 {
	public static void main(String[] args) throws FileNotFoundException {
		// Test03.txt ������ ������ �о
		// List�� ��´�.
		// List�� ������ ������ ���� �� ������ Ŭ������ ����
		// ���� ��´�.
		// Test03Data - name, score
		File f = new File("src/day14/quiz/Test03.txt");
		Scanner sc = new Scanner(f);
		List<Test03Data> list = new ArrayList<>();
		while (sc.hasNextLine()) {
			String[] line = sc.nextLine().split(":");
			Test03Data td = new Test03Data(
					line[0], Integer.parseInt(line[1]));
			list.add(td);
		}
		// ������ ������ ��� ����Ʈ�� ������ ȭ�鿡 ���
		for (Test03Data td : list) {
			System.out.print("�̸� : " + td.getName());
			System.out.println(", ���� : " + td.getScore());
		}
		
	}
}







