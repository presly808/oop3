package week4.day1;

import java.util.ArrayList;

import week3.day1.Employee;

public class ArrayListTest {

	public static void main(String[] args) {
		// Object[] or Employee[] 
		ArrayList<Employee> list = new ArrayList<Employee>(40);
		list.add(new Employee("Vova", 22, 12300, "IT"));
		list.get(0);
		Employee em =  list.get(list.size() - 1);
		System.out.println("test "+ em);
		list.add(new Employee("Vova", 22, 12300, "IT"));
		/*list.isEmpty();
		list.trimToSize();*/
		
		//int 
		ArrayList<Integer> listInt = new ArrayList<Integer>();
		listInt.add(123);
		
		// int - Integer, double - Double, byte - Byte, char - Character
		Integer i = new Integer(23);
		
		// Autoboxing, Unboxing
		Integer i2 = 455; // int - > Integer 
		i2++;
		
		int res = i2 + 45;// Integer -> int
		Integer res2 = (i2 + 67) + 45;
		// Immutable
		
		int parsedInt = Integer.parseInt("34");
		System.out.println(parsedInt);
		
	}

}
