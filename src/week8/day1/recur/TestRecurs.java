package week8.day1.recur;

public class TestRecurs {

	public static void main(String[] args) {
		System.out.println(fact(5));
		System.out.println(factR(5));
	}
	
	public static int fact(int num){
		int res = 1;
		for(int i = res; i <= num; i++){
			res *= i;
		}
		return res;
	}
	
	public static int factR(int num){
		if(num < 2){
			return 1;
		}
		
		return num * factR(num - 1);
	}

}
