package collections;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		Set<Object> set = new LinkedHashSet<Object>();
		set.add("Zera");
		set.add("Penguin");
		set.add("Lion");
		set.add("Elephant");
		set.add("Alicator");
		set.add(123);
		set.add(false);
	
		//System.out.println(set);
		Iterator<Object> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
