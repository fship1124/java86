package collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Menu {
	public Menu() {}
	
	private List<ISand> sandList;
	private Set<ISand> sandSet;
	private Map<String, ISand> sandMap;
	private Properties sandProp;
	
	public void setSandProp(Properties sandProp) {
		this.sandProp = sandProp;
	}

	public void setSandSet(Set<ISand> sandSet) {
		this.sandSet = sandSet;
	}

	public void setSandMap(Map<String, ISand> sandMap) {
		this.sandMap = sandMap;
	}

	public void setSandList(List<ISand> sandList) {
		this.sandList = sandList;
	}
	
	public void printList() {
		for (ISand sand : sandList) {
			sand.info();
		}
	}
	
	public void printSet() {
		for (ISand sand : sandSet) {
			sand.info();
		}
	}
	
	public void printMap() {
		for(String key : sandMap.keySet()) {
			sandMap.get(key).info();
		}
	}
	
	public void printProp() {
		for(Object key : sandProp.keySet()) {
			System.out.println(sandProp.get(key));
		}
	}
	
}
