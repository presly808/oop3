package week5.day2.structures;

import java.util.EmptyStackException;

public class MyStack implements IStack {

	private Object[] mas;
	private int index = 0;
	
	public MyStack(){
		mas = new Object[10];
	}
	
	public MyStack(int size){
		mas = new Object[size];
	}
	
	
	@Override
	public void push(Object o) {
		if(index < mas.length)
			mas[index++] = o;
		else 
			throw new FullStackException();
	}

	@Override
	public Object pop() {
		if(index == 0)
			throw new MyEmptyStackException();
		return mas[--index];
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = index - 1; i >= 0; i--){
			sb.append(mas[i].toString() + "\n");
		}
		return sb.toString();
	}
	
	

}
