package week4.day2.enums;

public enum Season {
	
	WINTER("Winter", 30), SPRING("Spring", 100), 
	SUMMER("Summer", 300), AUTUMN("Autumn", 90);
	
	private String name;
	private int days;
	
	private Season(String name, int days) {
		this.name = name;
		this.days = days;
	}
	
	public String getName(){
		return name;
	}
	
}
