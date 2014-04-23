package week4.day1.interfaces;

public class SuperPerson implements StudentBehavior, WorkerBehavior {
	
	
	@Override
	public void work(int hours) {
		System.out.println("Im working for " +hours);
	}

	@Override
	public void goToWork() {
		System.out.println("Im going to workplace");
	}

	@Override
	public void study(int hours) {
		System.out.println("Im studying");
	}

	@Override
	public void goToUnivercity() {
		System.out.println("Go away, Im sleeping!");
	}
	
	
}
