package week4.day2.streams;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private String name;
	private int age;
	private transient String pass;// null
	private Company com;
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Company getCom() {
		return com;
	}

	public void setCom(Company com) {
		this.com = com;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}
	
	
	
}
