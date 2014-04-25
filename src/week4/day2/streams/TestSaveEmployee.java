package week4.day2.streams;

import java.io.IOException;

public class TestSaveEmployee {

	public static void main(String[] args) throws IOException {
		Employee empl = new Employee("Vova", 22);
		IEmployeeSaver saver = new EmployeeSaver();
		saver.save(empl, "f:/employee.txt");
		Employee loaded = saver.load("f:/employee.txt");
		System.out.println(loaded);
	}

}
