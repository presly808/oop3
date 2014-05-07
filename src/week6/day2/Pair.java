package week6.day2;

import java.io.Serializable;

public class Pair <K extends Comparable<K>,V> {
	
	//can not create generic
	private K key;
	private V value;
	
	
	public Pair() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public V getValue() {
		return value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public void action(){
		
	}
	
}
