package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		Set<Object> set = new TreeSet<Object>();
		set.add("Zera");
		set.add("Penguin");
		set.add("Lion");
		set.add("Elephant");
		set.add("Alicator");
		
	
		System.out.println(set);
		Iterator<Object> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
