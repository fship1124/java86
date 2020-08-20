package collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Menu {
	public Menu() {}
	
	// ====================================================
	private List<ISand> sandList;
	public void setSandList(List<ISand> sandList) {
		this.sandList = sandList;
	}
	public void printList() {
		for (ISand sand : sandList) {
			sand.info();
		}
	}
	
	// ====================================================
	private Set<ISand> sandSet;
	public void setSandSet(List<ISand> sandSet) {
		this.sandList = sandList;
	}
	public void printSet() {
		for (ISand sand : sandList) {
			sand.info();
		}
	}
	
	
	// ====================================================
	private Map<String, ISand> sandMap;
	public void setSandMap(Map<String, ISand> sandMap) {
		this.sandMap = sandMap;
	}
	
	public void printMap() {
		Set<String> keySet = sandMap.keySet();
		for (String key : keySet) {
			sandMap.get(key).info();
//			ISand sand = sandMap.get(key);
//			sand.info();
		}
	}
	
	// ====================================================
	private Properties sandProp;
	public void setSandProp(Properties sandProp) {
		this.sandProp = sandProp;
	}
	public void printProp() {
		Set<Object> keySet = sandProp.keySet();
		for (Object key : keySet) {
			System.out.println(sandProp.get(key));
		}
	}
	
}
