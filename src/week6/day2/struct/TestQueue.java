package week6.day2.struct;

public class TestQueue {

	public static void main(String[] args) {
		MyQueueArr<Integer> queueArr = new MyQueueArr<Integer>();
		
		queueArr.enqueue(12);
		queueArr.enqueue(111);
		
		queueArr.enqueue(45);
		
		System.out.println(queueArr.dequeue());
		System.out.println(queueArr.dequeue());
		System.out.println(queueArr.dequeue());

	}

}
