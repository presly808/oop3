package week3.day2;

import week3.day1.Employee;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public final class FinalClass {
	
	private final String state;
	private final int index;
	private final Employee employee;

	
	public FinalClass(int index, String state, Employee employee){
		this.state = state;
		this.index = index;
		this.employee = employee;
	}
	
	public void showState(){
		employee.setName("Vova");
		System.out.println(index + "\n" + state+"\n"+employee);
	}
	
	
	
	
}
