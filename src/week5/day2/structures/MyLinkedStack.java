package week5.day2.structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedStack implements Iterable {

	private Node top;
	
	public void push(Object o){
		if(top == null){
			top = new Node(o, null);
		}
		
		Node newNode = new Node(o, top); // create node and link with last
		top = newNode; // change last node in stack
		
	}
	
	public Object pop(){
		if(top == null){
			throw new NoSuchElementException();
		}
		Object o = top; // 
		top = top.next;
		return o;
	}
	
	public void showAll(){
		for(Node i = top; i.next != null; i = i.next){
			System.out.println(i.value);
		}
	}
	
	
	private static class Node {
		Object value;
		Node next;
		
		public Node(Object value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}
		
	}
	
	@Override
	public Iterator iterator() {
		return new MyStackIterator();
	}


	private class MyStackIterator implements Iterator {

		private Node iterNode = top;
		
		@Override
		public boolean hasNext() {
			return iterNode != null;
		}

		@Override
		public Object next() {
			Object o = iterNode.value; // 1
			iterNode = iterNode.next; // 2
			return o;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
}
