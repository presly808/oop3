package week7.day1.struct;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestStruc {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		list.addAll(list);

		String[] mas = new String[10];
		list.toArray(mas);
		
		list.iterator();
		for(String s : list){
			System.out.println(s);
		}
	}

}
