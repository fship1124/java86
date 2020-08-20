package day14.quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WebToonDAO {

	private int no;
	private List<WebToon> list;
	File f = new File("src/day14/quiz/Webtoon.txt");
	Scanner sc; 

	public WebToonDAO() throws FileNotFoundException {
		list = new ArrayList<>();
		sc = new Scanner(f);
		
		while (sc.hasNextLine()) {
			String[] line = sc.nextLine().split(":");
			WebToon wt = new WebToon(Integer.parseInt(line[0]), 
					                                   line[1],
					                 Integer.parseInt(line[2]),
					                                   line[3],
					                 Integer.parseInt(line[4]),
					                 Double.parseDouble(line[5]));
			list.add(wt);
		}
		
	}

	
	
	public List<WebToon> selecAllWeb() {
		return list;
	}

    public List<WebToon> selecAuthorWeb() {
    	return list;
    }
}
