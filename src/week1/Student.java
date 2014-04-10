package week1;

public class Student {

	String name;
	int age;

	private static int count = 0;
	
	Address studentAddress;
	
	public Student(){
		System.out.println("Default Student constructor");
	}
	
	public Student(String n, int a){
		name = n;
		age = a;
		count++;
	}
	
	public Student(String name){
		this.name = name;
	}
	
	public void sayHello(){
		System.out.println("Hi my name is " + name + " age " + age);
	}
	
	
}
