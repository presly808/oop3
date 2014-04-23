package week4.day1.interfaces;

/**
 * SuperPerson is a student and a worker at same time
 * We can use SuperPerson for methods if we depend on interfaces, not concrete class 
 * @author admin
 *
 */
public class TestInterfaces {

	public static void main(String[] args) {
		Worker w = new Worker();
		
		Student s = new Student();
		
		SuperPerson sp = new SuperPerson();
		
		doWork(sp);
		doStudy(sp);
		
	}
	
	//was coded year ago
	public static void doWork(WorkerBehavior w){
		w.work(12);
	}
	
	public static void doStudy(StudentBehavior s){
		s.study(12);
	}

}
