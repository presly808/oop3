package week2.day1;

public class MyDate {
	
	private int year;
	private int month;
	private int day;
	
	public int hours;
	private int minutes;

	private String errorMessage = "Invalid ";
	private boolean isValid = true;
	
	public MyDate(int year, int month, 
			int day, int hours, int minutes){
		
		validate(year, month, day);
		
		if(!isValid){
			System.out.println(errorMessage);
		} else {
			this.year = year;			
			this.month = month;
			this.day = day;
			this.hours = hours;
			this.minutes = minutes;
		}
	}
	
	private void validate(int year, int month, int day){
		
		if(year < 0){ 
			errorMessage += "year ";
			isValid = false;
		}
		if(day < 1 && day > 31){
			errorMessage += "day ";
			isValid = false;
		}
		if(month < 1 && month > 12){
			errorMessage = "month";
			isValid = false;
		}
	}
	
	public int getYear(){
		return year;
	} 
	
	public int getMonth(){
		return month;
	}
	
	public int getDay(){
		return day;
	}
	
	public MyTime getTime(){
		return new MyTime(hours, minutes);
	}
	
	public void showTime(){
		System.out.println(hours + ":" + minutes);
	} 
	
	public void showFullTime(){
		if(!isValid){
			System.out.println(errorMessage);
			return; // exit from method
		}
	
		System.out.print(year+"-"+month+"-"+day+" ");
		showTime();
	}
}
