package week3.day1;

public class TestEmployee {

	public static void main(String[] args) {
		Tester t1 = new Tester("Anton", 22, 1500.78, "EPAM");
		Tester t2 = new Tester("Andrey", 35, 1500.78, "EPAM");
		Tester t3 = new Tester("Bogdan", 30, 1500.78, "EPAM");
		Manager m1 = new Manager("Olia", 25, 2000, "EPAM");
		
		t1.equals(t2);
		m1.equals(t1);
		
		
		Manager m = new Manager("Lesia", 23, 2000, "Infopulse");
		m.addEmployee(t1);
		m.addEmployee(t2);
		m.addEmployee(t3);
		m.addEmployee(m1);
		
		m.sayHello();
		m.showTeam();
		
		Employee emp = new Manager();
		if(emp instanceof Tester){
			Tester t5 = (Tester)emp; // ClassCastException
			t5.test();
		}
	}

}
