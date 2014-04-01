package week1;

/*
 * Describe each line of code, before using
 */
public class Group {
	
	String name;
	Student[] students = new Student[10];
	int index = 0;
	
	Address address;
	
	public void addStudent(Student s){
		students[index] = s;
		index++;
	}
	
	public void deleteLastStudent(){
		students[--index] = null;
	}
	
	public void showAll(){
		for(int i = 0; i < index; i++){
			System.out.println(i + ". Name = " + students[i].name + " age = " + students[i].age);
		}
	}
	
}
