package week8.day1.recur;

import java.io.File;

public class Searcher {
	
	public static final String PATH = "f:/Test";
	
	public static void main(String[] args) {
		
		File dir = new File("f:/acer_data/tihovsky");
		
		//showAllFiles(dir);
		find(new File(PATH), "asd");
		
		
		
		
		
		
		//find(new File("f:/acer_data/tihovsky"), "sss.txt");
	}
	
	public static void showAllFiles(File dir){
		if(dir.isDirectory()){
			File[] files = dir.listFiles();
			for(File f : files) {
				System.out.println(f.getName());
			}
		}
	}
	
	public static void find(File file, String query){
		if(file.isDirectory()){
			File[] list = file.listFiles();
			for(File f : list){
				if(f.isFile()){
					if(f.getName().equals(query))
						System.out.println(f.getAbsolutePath());
				} else {
					find(f, query);
				}
			}
		} else {
			if(file.isFile() && file.getName().equals(query)){
				System.out.println(file.getAbsolutePath());
			}
		}
	}
}
