package week7.day1.struct;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSe {
	
	public static void main(String[] args) {
		Set<StudentForHash> hashSet = new HashSet<StudentForHash>();
		
		StudentForHash sf = new StudentForHash("Vova", 22, 1200, 23);
		StudentForHash sf1 = new StudentForHash("Vova", 22, 1200, 23);
		StudentForHash sf2 = new StudentForHash("Misha", 20, 1222, 23);
		
		hashSet.add(sf);
		hashSet.add(sf1);
		hashSet.add(sf2);
		Iterator<StudentForHash> iter = hashSet.iterator();
		
		while(iter.hasNext()){
			StudentForHash s = iter.next();
			System.out.println(s);
		}
	}
}
