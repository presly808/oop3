package week4.day2.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class TestStream {

	private static final String PATH = "f:/test.txt"; 
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(PATH);
		
		int sym = fis.read();
		while(sym != -1){
			System.out.print((char)sym);
			sym = fis.read();
		}
		
		String seq = "text for write";
		FileOutputStream fos = new FileOutputStream(PATH);
		char[] chars = seq.toCharArray();
		for(int i = 0; i< chars.length; i++){
			fos.write(chars[i]);
		}
		

	}

}
