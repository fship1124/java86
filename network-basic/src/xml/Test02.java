package xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test02 {
	public static void main(String[] args) {
		List<FamilyVO> fList = new ArrayList<>();
		
		DocumentBuilderFactory factory = 
				DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document dom = builder.parse("src/xml/family.xml");
			NodeList list = dom.getElementsByTagName("family");
			for (int i = 0; i < list.getLength(); i++) {
				// FamilyVO 객체 생성
				FamilyVO fv = new FamilyVO();
				
				Node cNode = list.item(i);
				NodeList cList = cNode.getChildNodes();
				int cLength = cList.getLength();
				for (int j = 0; j < cLength; j++) {
					Node chNode = cList.item(j);
					String chName = chNode.getNodeName();
					if ("#text".equals(chName)) continue;
					
					// father, mother, me 일 경우
					String value = chNode.getTextContent();
					
					switch (chName) {
					case "father": fv.setFather(value); break;
					case "mother": fv.setMother(value); break;
					case "me": fv.setMe(value); break;
					}
				}
				
				fList.add(fv);
			}
			
			System.out.println("--------------------------");
			System.out.println("아버지\t어머니\t나");
			System.out.println("--------------------------");
			for (FamilyVO fVO : fList) {
				System.out.println(
					fVO.getFather() + "\t" +
					fVO.getMother() + "\t" +
					fVO.getMe()		
				);
			}
			System.out.println("--------------------------");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}












