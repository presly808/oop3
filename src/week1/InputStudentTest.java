package week1;

import java.util.Scanner;

public class InputStudentTest {
	
	public static void main(String[] args) {
		//1 get size of students
		Scanner sc = new Scanner(System.in);
		System.out.println("Input group size");
		int size = sc.nextInt();

		//2 init mas for students _ _ _ _ _ 
		Student[] group = new Student[3];
		
		for(int i = 0; i < group.length; i++){
			Student s = new Student();
			
			System.out.println("Input name");
			s.name = sc.next();
			
			System.out.println("Input age");
			s.age = sc.nextInt();
			
			group[i] = s;
		}
		
		System.out.println("All students");
		for(int i = 0; i < group.length; i++){
			group[i].sayHello();
		}
		
	}
}
