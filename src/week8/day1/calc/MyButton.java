package week8.day1.calc;

public class MyButton {
	
	private MyListener listener;
	
	
	
	public MyListener getListener() {
		return listener;
	}



	public void setListener(MyListener listener) {
		this.listener = listener;
	}



	public void buttonPressed(){
		listener.action();
	}
	
}
