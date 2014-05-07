package week5.day2.structures;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<T> implements IStack<T> {

	private T[] mas;
	private int index = 0;
	
	public MyStack(){
		mas = (T[]) new Object[10];
	}
	
	public MyStack(int size){
		mas = (T[]) new Object[size];
	}
	
	
	@Override
	public void push(T o) {
		if(index < mas.length)
			mas[index++] = o;
		else 
			throw new FullStackException();
	}

	@Override
	public T pop() {
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

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj != null ? obj.getClass() != MyStack.class : true){
			return false;
		}
		
		MyStack that = (MyStack) obj;
		
		if(index != that.index){
			return false;
		} 
		
		for(int i = 0; i < index; i++){
			if(!this.mas[i].equals(that.mas[i])){
				return false;
			}	
		}
		
		
		return true;
	}
	
	

}
