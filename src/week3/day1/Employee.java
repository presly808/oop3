package week3.day1;

public class Employee {
	
	private String name;
	private int age;
	private double salary;
	private String company;
	
	public Employee(){
		
	}
	
	public Employee(String name, int age, double salary, String company) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.company = company;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public void sayHello(){
		System.out.println("I'm " + name + " age " + 
								age +" salary " + salary);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		
		if(!(obj instanceof Employee)){
			return false;
		}
		
		Employee empl = (Employee) obj;
		if(name.equals(empl.getName()) && 
				age == empl.getAge() && 
				salary == empl.getSalary() && 
				company.equals(empl.getCompany())){
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "name = " + name + 
				"; age = " + age + "; salary = " + salary;
	}
	
	
}
