package week5.day1.inner;

import java.util.Date;

import week5.day1.inner.MyOutherArray.Pair;

public class Test {

	public static void main(String[] args) {
		
		//Inner, nested
		Student.Bilet bilet = new Student.Bilet(5, new Date());
		MyOutherArray m = new MyOutherArray();
		MyOutherArray.Pair p = m.new Pair();
		
		
		//local
		
		
		class My {
			int a;
			int b;
		}
		
		
		
	}

}
