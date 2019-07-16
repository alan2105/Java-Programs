package collections;

import java.util.LinkedList;


public class LikedListClass {
	
public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<String>();
	list.add("Tamil");
	list.add("English");
	list.add("Maths");
	list.add("Java");
	
	list.addFirst("ResctJS");
	list.addLast("JavaScript");
	
	System.out.println(list);
	System.out.println(list.get(2));
	System.out.println(list.getFirst());
	System.out.println(list.getLast());
	
	System.out.println(list.indexOf("English"));
}
	
	
	


}
