package week5.day2.structures;

import week4.day2.streams.Employee;

public class TestStack {
	
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(new Employee("Vova", 23));
		stack.push(new Employee("Anton", 30));
		stack.push(new Employee("Kolia", 40));
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(stack);
	}	
	
}
