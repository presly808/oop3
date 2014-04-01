package week1;

public class TestGroup {

	public static void main(String[] args) {
		Group g1 = new Group();
		
		Student s1 = new Student();
		s1.name = "1st";
		
		Student s2 = new Student();
		s2.name = "2nd";
		
		g1.addStudent(s1);
		g1.addStudent(s2);
		
	}

}
