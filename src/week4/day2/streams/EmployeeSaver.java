package week4.day2.streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeSaver implements IEmployeeSaver{
	
	private FileWriter fw = null;
	
	public EmployeeSaver() throws IOException {
		super();
	}
	
	
	@Override
	public void save(Employee em, String path) {
		try{
			fw = new FileWriter(path);
			fw.write(em.toString());
			fw.flush();
		} catch (IOException io){
			io.printStackTrace();
		} finally {
			if(fw != null){
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}


	@Override
	public Employee load(String path) {
		BufferedReader bf = null;
		FileReader fr = null;
		String line = null;
		try {
			fr = new FileReader(path);
			bf = new BufferedReader(fr);
			line = bf.readLine();
			
		} catch (FileNotFoundException fnfe){
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if(bf != null){
				try {
					bf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fr != null){
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return parseLine(line);
	}
	
	private Employee parseLine(String line){
		String[] fields = line.split(",");
		String name = fields[0].split("=")[1];
		int age = Integer.parseInt(fields[1].split("=")[1]);
		return new Employee(name, age);
	}
	
	
	
}
