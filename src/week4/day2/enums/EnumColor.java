package week4.day2.enums;

public enum EnumColor {
	RED("Red"),BLACK("Black");
	
	String name;

	private EnumColor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	
	
	
}
