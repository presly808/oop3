package week4.day1.abstract_class;


public class TestAbstract {

	public static void main(String[] args) {
		AbstractEmployee ae = new ManagerFA("Some", 23, 5600);

	}
	
	public static void printInfo(ManagerFA m){
		m.sayHello();
	}

}
