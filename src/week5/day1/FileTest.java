package week5.day1;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		showFilesInDir("f:/");

	}
	
	private static void showFilesInDir(String path){
		File dir = new File(path);
		if(dir.isDirectory()){
			for(File file : dir.listFiles()){
				System.out.println(file.getName());
			}
		}
	}

}
