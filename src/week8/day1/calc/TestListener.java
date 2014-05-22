package week8.day1.calc;

public class TestListener {

	public static void main(String[] args) {
		MyButton button = new MyButton();
		button.setListener(new MyListener() {
			
			@Override
			public void action() {
				System.out.println("listener action");
				
			}
		});

		
		button.buttonPressed();
	}

}
