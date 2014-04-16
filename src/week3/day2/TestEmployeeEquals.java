package week3.day2;

import week3.day1.Employee;
import week3.day1.Tester;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class TestEmployeeEquals {

	public static void main(String[] args) {
		Employee e1 = new Employee("Vova", 22, 2000, "EPAM");
		Employee e2 = new Employee("Vova", 22, 2000, "EPAM");
		Employee e3 = new Employee("Vova", 22, 2000, "EPAM");
		
		Tester t = new Tester("Andrey", 20, 1249, "Infopulse");
		System.out.println("e1 eq e2 = " + e1.equals(e2));
		System.out.println("e2 eq e3 =" + e2.equals(e3));
		System.out.println("e1 eq e3 =" + e1.equals(e3));
		
		
		System.out.println(t);
		System.out.println(e1);
	}

}
