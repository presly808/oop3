package week3.day2;

import week3.day1.Employee;

public class EmployeeMasHelper {
	
	//Selection Sort
	public static Employee[] sortByAge(Employee[] employees){
		for(int i = 0; i < employees.length && employees[i] != null; i++){
			//pivot 
			Employee min = employees[i];
			int minI = i;
			
			for(int j = i; j < employees.length && employees[j] != null; j++){
				if(min.getAge() > employees[j].getAge()){
					min = employees[j];
					minI = j;
				}
			}
			//swap two references
			Employee temp = employees[i];
			employees[i] = min;
			employees[minI] = temp;
			
		}
		return employees;
	}
	
	public static Employee[] sortByName(Employee[] employees){
		for(int i = 0; i < employees.length && employees[i] != null; i++){
			//pivot 
			Employee min = employees[i];
			int minI = i;
			
			for(int j = i; j < employees.length && employees[j] != null; j++){
				if(min.getName().compareTo(employees[j].getName()) > 0){
					min = employees[j];
					minI = j;
				}
			}
			//swap two references
			Employee temp = employees[i];
			employees[i] = min;
			employees[minI] = temp;
			
		}
		return employees;
	}
	
	public static Employee[] genEmployeeMas(){
		Employee[] employees = new Employee[5];
		employees[0] = new Employee("Vova", 43, 1279, "EPAm");
		employees[1] = new Employee("Andrey", 17, 1279, "EPAm");
		employees[2] = new Employee("Bogdan", 29, 1279, "EPAm");
		employees[3] = new Employee("Ivan", 22, 1279, "EPAm");
		employees[4] = new Employee("Vasia", 20, 1279, "EPAm");
		return employees;
		
	}
	
	public static void showEmployeeMas(Employee[] mas){
		//for each block
		for(Employee e : mas){
			System.out.println(e);
		}
	}
	
}
