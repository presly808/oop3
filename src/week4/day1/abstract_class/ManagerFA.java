package week4.day1.abstract_class;


public class ManagerFA extends AbstractEmployee {

	public ManagerFA(String name, int age, double salary) {
		super(name, age, salary);
	}

	@Override
	public void sayHello() {
		System.out.println("Manager " + getName() + 
				" age " + getAge());
		
	}	

}
