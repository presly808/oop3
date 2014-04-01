package week1;

/*
 * Binding two instances, student know about address
 */
public class Ex3 {

	public static void main(String[] args) {
		Student s = new Student();
		s.age = 23;
		s.name = "Vova";
		
		Address address = new Address();
		address.city = "Kiev";
		address.country = "UA";
		address.street = "Kardachi 2";
		
		s.studentAddress = address;

	}

}
