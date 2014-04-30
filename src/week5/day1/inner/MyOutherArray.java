package week5.day1.inner;

public class MyOutherArray {
	
	private Comparable[] mas;
	private Pair minMax = new Pair().init();
	private int minI = 0;
	
	private void go(){
		
	}
	
	public class Pair {
		
		int minI;
		int maxI;
		
		Pair init(){
			MyOutherArray.this.minI++;
			Comparable minEl = mas[0];
			Comparable maxEl = mas[0];
			for(int i = 0; i < mas.length; i++){
				if(mas[i].compareTo(minEl) < 0){
					minEl = mas[i];
					minI = i;
				}
				if(mas[i].compareTo(maxEl) > 0){
					maxEl = mas[i];
					maxI = i;
				}
			}
			return this;
		}
	}
	
	
}
