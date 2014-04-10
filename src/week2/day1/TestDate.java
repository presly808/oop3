package week2.day1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input date. Ex.\n yyyy-MM-dd HH:mm");
		String stringDate = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //set pattern
		Date d = sdf.parse(stringDate); //get Date from String
		
		sdf.applyPattern("dd-MM-yyyy HH:mm"); // change pattern 
		System.out.println(sdf.format(d)); //get String from Date and out
	}

}
