package week2.day2;

public class Student {
	
	private String name;
	private int age;
	
	private static int count = 0;
	
	public Student(String name, int age){
		this.name = name;
		this.age = age;
		count++;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	public static int getCount(){
		return count;
	}
	
}
