package week3.day2;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("");
		
		for(int i = 0; i < 100; i++){
			sb.append(i + " ");
		}
		String res = sb.toString();
		System.out.println(res);
		
		String res1 = "";
		for(int i = 0; i < 100; i++){
			res1 = res1 + i + " ";
		}
		System.out.println(res1);

	}

}
