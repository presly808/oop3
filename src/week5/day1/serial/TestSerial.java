package week5.day1.serial;

import java.util.Arrays;

import week4.day2.streams.Company;
import week4.day2.streams.Employee;



public class TestSerial {

	private static final String PATH = "f:/serial_empl.txt";
	public static void main(String[] args) {
		Employee[] team = new Employee[6]; 
		team[0] = new Employee("Vasia", 20);
		team[1] = new Employee("Kolia", 20);
		team[2]= new Employee("Petia", 20);
		team[3] = new Employee("Igor", 20);
		team[4] = new Employee("Ivan", 20);
		
		IFileHelper fileHelper = new IFileHelperImpl();
		fileHelper.save(team, PATH);
		
		Employee[] loadedEmpl =  (Employee[]) fileHelper.load(PATH);
		System.out.println(Arrays.toString(loadedEmpl));
	}

}
