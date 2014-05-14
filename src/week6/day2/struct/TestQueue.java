package week6.day2.struct;

import java.util.Iterator;

public class TestQueue {

	public static void main(String[] args) {
		MyQueueArr<Integer> queueArr = new MyQueueArr<Integer>();
		
		queueArr.enqueue(12);
		queueArr.enqueue(111);
		
		queueArr.enqueue(45);
		
		//Iterator<Integer> iter =  queueArr.iterator();
		//while(iter.hasNext()){
			//System.out.println(iter.next());
		//}
		
		for(Integer i : queueArr){
			System.out.println(i);
		}
	}

}
