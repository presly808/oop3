package week4.day1.interfaces;

public class Worker implements WorkerBehavior{
	
	private String name;
	private int age;
	private double salary;
	
	public Worker() {
		super();
	}

	public Worker(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
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

	public void work(int hours){
		System.out.println("Im working for " +hours);
	}
	
	public void goToWork(){
		System.out.println("Im going to workplace");
	}
	
	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", salary=" + salary
				+ "]";
	}
	

	
	
}
