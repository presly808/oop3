package week4.day1.interfaces;

public class Student implements StudentBehavior {
	
	private String name;
	private int age;
	private String major;
	private int cource;
	
	public Student(String name, int age, String major, int cource) {
		super();
		this.name = name;
		this.age = age;
		this.major = major;
		this.cource = cource;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getCource() {
		return cource;
	}

	public void setCource(int cource) {
		this.cource = cource;
	}

	public void study(){
		System.out.println("Im studying for ");
	}
	
	
	@Override
	public void study(int hours) {
		System.out.println("Im studying");
		
	}

	@Override
	public void goToUnivercity() {
		System.out.println("Go away, Im sleeping!");
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", major=" + major
				+ ", cource=" + cource + "]";
	}
	
	
	
	
	
}
