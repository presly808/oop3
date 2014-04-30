package week5.day1.inner;

import java.util.Comparator;

import week4.day2.streams.Employee;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getAge() < o2.getAge() ? -1 : 
					(o1.getAge() > o2.getAge() ? 1 : 0);
	}

}
