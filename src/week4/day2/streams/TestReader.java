package week4.day2.streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

public class TestReader {
	
	public static void main(String[] args) {
		write("sbdfkjbsdkjfnsd", "f:/te.txt");
		
	}
	
	public static String read(){
		String line = "";
		try {
			FileReader fr = new FileReader("f:/test2.txt");
			BufferedReader br = new BufferedReader(fr);
			
			line = br.readLine();
			
			
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return line;
	}
	
	public static void write(String s, String path){
		File f = new File(path);
		FileWriter fw = null;
		
		try {
			fw.write(s);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			System.err.println("In catch");
			//throw e;
		} finally {
			System.out.println("In finally");
			if(fw != null){
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
}
