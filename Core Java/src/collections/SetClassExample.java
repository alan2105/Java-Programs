package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetClassExample {

	public static void main(String[] args) {
		
		Set<Object> set = new HashSet<Object>();
		set.add("Test1");
		set.add("Test2");
		set.add("Test3");
		set.add("Test4");
		set.add("Test4");
		set.add(123);
		set.add(false);
		set.add(false);
		
		
		//System.out.println(set);
		Iterator<Object> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
