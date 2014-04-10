package week1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();// get current date
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("dd/MM/yyyy");
		
		Date d = sdf.parse("12/04/1998");
		System.out.println(sdf.format(date));

	}

}
