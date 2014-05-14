package week7.singleton;

public class TestSingleton {
	public static void main(String[] args) {
			ConnectionInfoSingleton info = ConnectionInfoSingleton.getInstance();
			
			ConnectionInfoSingleton info1 = ConnectionInfoSingleton.getInstance();
	}
}
