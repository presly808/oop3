package week3.day1;

import week4.day1.interfaces.ManagerBehavior;

public class Manager extends Employee implements ManagerBehavior {

	private Employee[] team = new Employee[10]; // null
	private int index = 0;
	
	public Manager() {
		super();
	}

	public Manager(String name, int age, double salary, String company) {
		super(name, age, salary, company);
	}

	public void monitor(){
		System.out.println("I'm monitoring my team...");
	}
	
	public void addEmployee(Employee empl){
		if(empl instanceof Tester){
			System.out.println("Add tester");
		}
		if(empl instanceof Manager){
			System.out.println("Add manager");
		}
		empl.sayHello();
		
		team[index] = empl;
		index++;
	}
	
	public void showTeam(){
		for(int i = 0; i < team.length && team[i] != null; i++) {
			team[i].sayHello();
		}
	}
	
	public void letTestersWork(){
		
	}
	
	public void work(){
		
	}
	
	public void work(int hours){
		
	}
	
	public void sayHello(){
		System.out.println("Im manager");
		System.out.println(getName() + " " + getAge());
	}
	
}
