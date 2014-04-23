package week4.day1;

import week3.day1.Employee;
import week3.day1.Manager;
import week4.day1.interfaces.Manager2;
import week4.day1.interfaces.ManagerBehavior;
/**
 * One interface, but different implementation of Manager
 * We depend on abstraction for flexible architecture
 * @author admin
 *
 */
public class TestManagerEmployee {

	public static void main(String[] args) {
		Manager m = new Manager();
		
		Manager2 m2 = new Manager2();
		
		test(m);
		test(m2);
		
	}
	
	//Flexible method
	public static void test(ManagerBehavior m){
		m.addEmployee(new Employee("Vova", 22, 2300, "IT"));
		m.showTeam();
	}
	
	
}
