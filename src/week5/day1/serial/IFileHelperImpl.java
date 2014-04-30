package week5.day1.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IFileHelperImpl implements IFileHelper {

	@Override
	public void save(Object o, String path) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(o);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(oos != null){
				try {
					oos.close();//Recursive close all streams
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public Object load(String path) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try{
			fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);
			return ois.readObject();
		} catch (FileNotFoundException f){
			f.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		} finally {
			if(ois != null){
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	
	

}
