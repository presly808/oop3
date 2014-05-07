package week6.day2.struct;

import java.util.NoSuchElementException;

public class MyQueueArr<T> implements IQueue<T>{

	private T[] mas = (T[]) new Object[10];
	private int head;
	private int tail;
	
	
	@Override
	public T dequeue() {
		if(head == tail) {
			throw new NoSuchElementException();
		}
		T o = mas[head];
		mas[head] = null;
		head++;
		return o;
	}

	@Override
	public void enqueue(T t) {
		mas[tail++] = t;
	}
	
	
	
}
