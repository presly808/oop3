package week4.day2.excep;

public class TestInputNumEx {

	public static void main(String[] args) throws InputNumberException {
		char c = 'a';
		try{
			parseInt(c);
		} catch (InputNumberException ine) {
			throw ine;
		}
		System.out.println("after method");
	}
	
	public static int parseInt(char c) throws InputNumberException {
		int res = -1;
		if(c > 47 && c < 58){
			res = c;
		} else {
			throw new InputNumberException(c + " is not a numbers not");
		}
		
		return res;

	}
	

}
