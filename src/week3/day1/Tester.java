package week3.day1;

public class Tester extends Employee {
	
	
	public Tester(String name, int age, double salary, String company){
		super(name, age, salary, company);
	}
	
	public Tester(){
		super();
	}
	
	
	public void test(){
		System.out.println("I'm testing...");
		sayHello();
	}
	
	public boolean equals(Object tester){
		Tester other = (Tester) tester;
		if(this.getName().equals(other.getName())){
			return true;
		}
		return false;
	}
	
}
