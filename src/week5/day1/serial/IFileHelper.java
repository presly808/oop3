package week5.day1.serial;

public interface IFileHelper {
	
	void save(Object o, String path);
	
	Object load(String path);
	
}
