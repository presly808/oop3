package week2.day1;

public class TestMyDate {

	public static void main(String[] args) {
		MyDate myDate = new MyDate(-23,4,8,20,12);
		myDate.showTime();
		
		myDate.showFullTime();
		myDate.hours = 12;
		myDate.showFullTime();
	}

}
