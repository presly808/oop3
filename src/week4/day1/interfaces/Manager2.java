package week4.day1.interfaces;

import java.util.ArrayList;

import week3.day1.Employee;

public class Manager2 implements ManagerBehavior {
	
	private ArrayList<Employee> team = new ArrayList<Employee>();
	
	@Override
	public void addEmployee(Employee e) {
		team.add(e);
	}

	@Override
	public void showTeam() {
		for(Employee e : team){
			e.sayHello();
		}
	}
	
}
