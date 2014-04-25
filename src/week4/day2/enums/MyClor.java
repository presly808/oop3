package week4.day2.enums;

public class MyClor {
	
	int colorValue;
	String name;
	
	public static final MyClor RED = new MyClor(25, "RED");
	public static final MyClor BLACK = new MyClor(200, "BLACK");
	

	public MyClor(int colorValue, String name) {
		super();
		this.colorValue = colorValue;
		this.name = name;
	}

	public MyClor() {
		super();
	}
	
	

}
