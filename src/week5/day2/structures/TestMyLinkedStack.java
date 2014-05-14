package week5.day2.structures;

import java.util.Iterator;

public class TestMyLinkedStack {

	public static void main(String[] args) {
		MyLinkedStack stack = new MyLinkedStack();
		
		stack.push("line1");
		stack.push("line2");
		stack.push("line3");
		stack.push("line4");
		stack.push("line5");
		stack.push("line6");
		stack.push("line7");
		stack.push("line8");
		
		for(Object o : stack){ // use iterator 
			System.out.println(o);
		}
		
		Iterator iter = stack.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
	}

}
