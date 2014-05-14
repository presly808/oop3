package week6.day2.struct;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyQueueArr<T> implements IQueue<T>, Iterable<T> {

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
	
	
	
	@Override
	public Iterator<T> iterator() {
		return new QueueIterator();
	}



	private class QueueIterator implements Iterator<T> {
		
		private int iterHead = head;
		
		@Override
		public boolean hasNext() {
			return iterHead < tail;
		}

		@Override
		public T next() {
			return mas[iterHead++];
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
		
	}
	
}
