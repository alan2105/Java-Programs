package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingCollectionsExample {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Windows");
		l1.add("Mac");
		l1.add("IOS");
		l1.add("Android");
		l1.add("Linux");
	//Sort by ascending order
	Collections.sort(l1);
	System.out.println("Ascending Order:"+l1);
	
	//Sort by descending order
	Collections.sort(l1,Collections.reverseOrder());
	System.out.println("Descending Order:"+l1);
	
	//Another way to sort by descending order
	Collections.sort(l1);
	Collections.reverse(l1);
	System.out.println("Descending Order:"+l1);
		
		Iterator<String> itr = l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
	}

}
