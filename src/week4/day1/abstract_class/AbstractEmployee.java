package week4.day1.abstract_class;

public abstract class AbstractEmployee {
	
	private String name;
	private int age;
	private double salary;
	
	public AbstractEmployee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public void simpleAction(){
		System.out.println("Action");
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public abstract void sayHello();
	
}
