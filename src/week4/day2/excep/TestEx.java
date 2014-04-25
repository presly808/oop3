package week4.day2.excep;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true){
			try {
				System.out.println("Input date");
				String strDate = sc.nextLine();
				Date d = parse(strDate);
				System.out.println("Date = " + d); 
				break;
			} catch (Exception e) {
				e.getMessage();
			} 
		
		}
		System.out.println("After catch");
		

	}
	
	public static Date parse(String source) throws ParseException, Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(source);
		return d;
	}

}
