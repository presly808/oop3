package week4.day2.streams;

public interface IEmployeeSaver {
	
	public void save(Employee empl, String path);
	
	public Employee load(String path);
	
}
