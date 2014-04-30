package week5.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("f:/team1.txt");
		Scanner sc = new Scanner(f);
		
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}

	}

}
