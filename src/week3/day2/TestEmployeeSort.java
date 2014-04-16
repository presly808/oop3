package week3.day2;

import week3.day1.Employee;

public class TestEmployeeSort {

	public static void main(String[] args) {
		Employee[] mas = EmployeeMasHelper.genEmployeeMas();
		EmployeeMasHelper.sortByAge(mas);
		
		EmployeeMasHelper.showEmployeeMas(mas);
		

	}

}
