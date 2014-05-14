package week7;

public class A <T extends Comparable<T>> {

	
	private Node<T> head = new Node<T>();
	
	private static class Node<T> {
		T t;
	}
	
	public T getType(){
		return head.t;
	}
}
