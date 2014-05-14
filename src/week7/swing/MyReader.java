package week7.swing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyReader {
	
	public static String readAll(String path){
		File f = new File(path);
		String s = "";
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()){
				s += sc.nextLine() +"\n";
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return s;
	}
	
}
