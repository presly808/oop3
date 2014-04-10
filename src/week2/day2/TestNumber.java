package week2.day2;

public class TestNumber {

	public static void main(String[] args) {
		Number n1 = new Number(45);
		
		Number n2 = new Number(12);
		
		Number n3 = n1.add(n2);
		
		System.out.println("Numner n3 = " + n3.getValue());

	}

}
