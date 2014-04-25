package week4.day2.enums;

public class PaintFense {
	public static void main(String[] args) {
//		printFence(3232);
//		printFence(MyClor.BLACK);
//		printFence(EnumColor.RED);
//		EnumColor red = EnumColor.RED;
//		System.out.println(red.getName());
		EnumColor.values();
		
		for(EnumColor ec : EnumColor.values()){
			System.out.println(ec.getName());
		}
		
		EnumColor ec2 = EnumColor.valueOf("BLACq");
		System.out.println(ec2.getName());
	}

	public static void printFence(int value) {

		switch (value) {
		case 1:
			System.out.println("Print in red color");
			break;
		case 2:
			System.out.println("Print in black color");
			break;
		default:
			System.out.println("Print in white color");
			break;
		}

	}

	public static void printFence(MyClor color) {

		if (color.equals(MyClor.BLACK)) {
			System.out.println("Print in black color");
		} else if (color.equals(MyClor.RED)) {
			System.out.println("Print in red color");
		} else
			System.out.println("Print in white color");

	}
	
	public static void printFence(EnumColor color) {

		switch (color) {
		case RED:
			System.out.println("Print in color " + color.getName());
			break;
		case BLACK:
			System.out.println("Print in black color");
			break;
		default:
			System.out.println("Print in white color");
			break;
		}

	}

}
