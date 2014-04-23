package week4.day1.comparable;

import java.util.ArrayList;
import java.util.Arrays;

import week3.day1.Employee;
import week3.day2.EmployeeMasHelper;

public class SortMain {

	public static void main(String[] args) {
		
		//Must implement interface Comparable in Employee for using Array.sort
		Employee[] team = EmployeeMasHelper.genEmployeeMas();
		//sort 
		Arrays.sort(team);
		//output 
		System.out.println(Arrays.toString(team));
	}

}
