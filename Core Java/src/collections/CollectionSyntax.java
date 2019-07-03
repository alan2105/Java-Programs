package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionSyntax {

	public static void main(String[] args) {
		//List Interface
		//Generic type-Store any type of data.
		
		List l1 = new ArrayList<>();
		List l2 = new LinkedList<>();
		
		//Object type-Store any kind of data.
		List<Object> l3 = new ArrayList<>();
		List <Object> l4 = new LinkedList<>();
		
		//Store a specific type of data.
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		
		List<String> list3 = new ArrayList<String>();
		List<String> list4 = new LinkedList<String>();
		
		//Set Interface
		
		Set<Object> s1 = new HashSet<Object>();
		Set<Object> s2 = new LinkedHashSet<Object>();
		Set<Object> s3 = new TreeSet<Object>();
		
		//Map Interface
		
		Map m1 = new HashMap();
		Map m2 = new LinkedHashMap();
		Map m3 = new TreeMap();
		
		Map <Integer, String> m4 = new HashMap<Integer, String>();
		Map <Integer, String> m5 = new LinkedHashMap <Integer, String>();
		Map <Integer, String> m6 = new TreeMap <Integer, String>();
		
		// HashTable in Map interface
		
		Map <Integer, String> hb = new Hashtable<Integer, String>();
		
		
		
	}
 
}
