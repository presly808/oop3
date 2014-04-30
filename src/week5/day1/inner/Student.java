package week5.day1.inner;

import java.util.Date;

public class Student {
	
	private String name;
	private int num; 
	private Bilet bilet = new Bilet(5,new Date());
	
	public static class Bilet {
		
		int rank;
		Date start;
		
		public Bilet(int rank, Date start) {
			super();
			this.rank = rank;
			this.start = start;
		}

		void showInfo(){
			System.out.println("rank=" + rank + " start=" + start);
		}
		
		void go(){
			
		}
	}
	
}
