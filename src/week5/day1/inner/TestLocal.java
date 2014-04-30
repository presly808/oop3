package week5.day1.inner;

import java.util.Arrays;
import java.util.Comparator;

import week4.day2.streams.Employee;

public class TestLocal {

	public static void main(String[] args) {
		
		IAction iA = new IAction() {
			int a;
			int b;
			
			@Override
			public void action() {
				showA();
				System.out.println("action");
				
			}
			
			void showA(){
				System.out.println(a);
			}
		};
		
		iA.action();
		
		
		Employee[] team = new Employee[5]; 
		team[0] = new Employee("Vasia", 24);
		team[1] = new Employee("Kolia", 21);
		team[2]= new Employee("Petia", 44);
		team[3] = new Employee("Igor", 33);
		team[4] = new Employee("Ivan", 12);
		
		//Annonym class
		Arrays.sort(team, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getAge() < o2.getAge() ? -1 : 
							(o1.getAge() > o2.getAge() ? 1 : 0);
			}
		});
		System.out.println("Sorted by age");
		System.out.println(Arrays.toString(team));
		
		Arrays.sort(team, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println("Sorted by name");
		System.out.println(Arrays.toString(team));
		
		
	}

}
