package week2.day2;

public class Number {
	
	private int value;
	
	public Number(int num){
		this.value = num;
	}
	
	public Number add(Number number){
		
		return new Number(value + number.getValue());
	}

	public int getValue() {
		return value;
	}
	
}
