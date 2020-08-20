package day13.generic;

public class Box3<K, V> {
    private K key;
    private V value;
    
    public Box3(K key, V value) {
    	this.key = key;
    	this.value = value;
    }
    public K getkey() {
    	return key;
    }
    public V getValue() {
    	return value;
    }
}
