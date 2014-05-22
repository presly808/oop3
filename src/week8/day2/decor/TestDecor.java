package week8.day2.decor;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestDecor {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Ingredient ingredient = new Chocolate(0.50, 2, null);
		ingredient = new Coconut(1, 3, ingredient);
		ingredient = new Cherry(1.5, 1, ingredient);
		
		Icecream icecream = new Icecream(7.0, ingredient);
		
		System.out.println(icecream.getTotalPrice());
		
		
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("f:/ss.txt"));
		oos.write(23);

	}

}
