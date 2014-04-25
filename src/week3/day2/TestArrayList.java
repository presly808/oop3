package week3.day2;

import java.util.ArrayList;

import week3.day1.Employee;
import week3.day1.Manager;
import week3.day1.Tester;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Manager m = new Manager("Vova", 22,	200,"IT");
		Tester t = new Tester("Serhii", 23, 2000, "IT");
		
		employees.add(t);
		employees.add(m);
	}

}
