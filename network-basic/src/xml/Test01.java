package xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test01 {
	public static void main(String[] args) {
		DocumentBuilderFactory factory = 
				DocumentBuilderFactory.newInstance();
		try {
			// DocumentBuilder : Dom Parser(xml 문서를 파싱하는 역활 수행)
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			// xml 문서를 읽어서 메모리에 올리기
			Document dom = builder.parse("src/xml/family.xml");
			NodeList list = dom.getElementsByTagName("family");
			System.out.println("family 수 " + list.getLength());
			for (int i = 0; i < list.getLength(); i++) {
				Node cNode = list.item(i);
				String nName = cNode.getNodeName();
				System.out.println("node name : " + nName);
				
				NodeList cList = cNode.getChildNodes();
				int cLength = cList.getLength();
				System.out.println("family의 child 노드 수 : " + cLength);
				for (int j = 0; j < cLength; j++) {
					Node chNode = cList.item(j);
					String chName = chNode.getNodeName();
					System.out.println("chNode name : " + chName);
					if ("#text".equals(chName)) continue;
					
					// father, mother, me 일 경우
					String value = chNode.getTextContent();
					System.out.println("value = " + value);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}












