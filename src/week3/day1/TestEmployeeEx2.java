package week3.day1;

public class TestEmployeeEx2 {

	public static void main(String[] args) {
		Tester t3 = new Tester("Bogdan", 30, 1500.78, "EPAM");
		Employee m1 = new Manager("Olia", 25, 2000, "EPAM");
		
		Manager m = new Manager("Lesia", 23, 2000, "Infopulse");
		m.addEmployee(t3);
		m.addEmployee(m1);
		
		m1.sayHello();

	}

}
