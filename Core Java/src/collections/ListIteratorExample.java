package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class ListIteratorExample {

	public static void main(String[] args) {
		
		List<String> lobj = new LinkedList<String>();
		lobj.add("iPhone 5");
		lobj.add("iPhone SE");
		lobj.add("iPhone 6");
		lobj.add("iPhone 6S");
		lobj.add("iPhone 7");
		
		ListIterator<String> li = lobj.listIterator();
		System.out.println("Travsing element in forward direction");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("Travsing element in backward direction");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		

	}

}
