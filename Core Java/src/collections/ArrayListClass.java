package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {

		
		  List<String> aList = new ArrayList<String>(); 
		  aList.add("Test1");
		  aList.add("Test2");
		  aList.add("Test3"); 
		  aList.add("Test4");
		  
		  System.out.println("Travesing List through Iterator");
		  Iterator<String> itr = aList.iterator(); 
		  while(itr.hasNext()) 
		  { 
			  System.out.println(itr.next());
		  }
		  
		  System.out.println("For Each Loop"); 
		  for (String obj : aList) {
			  
		  System.out.println(obj); 
		  }
		 
//ArrayList with user defined data type (Using class name)
		
		  Employee e1 = new Employee(101,"Alan", 35000); 
		  Employee e2 = new Employee(103,"Arul", 40000); 
		  Employee e3 = new Employee(102,"Pramodh",42000); 
		  List<Employee> eList = new ArrayList<Employee>(); 
		  eList.add(e1);
		  eList.add(e2); 
		  eList.add(e3);
		  
		  Iterator<Employee> itr2= eList.iterator();
		  while(itr2.hasNext()) 
		  { 
			  Employee ep = (Employee) itr2.next(); 
			  System.out.println(ep.EmpolyeeID+" "+ep.EmployeeName+" "+ep.Salary); 
			  }
		 
		  for (Employee e : eList) 
		  { 
			  System.out.println(e.EmpolyeeID+" "+e.EmployeeName+" "+e.Salary); 
			  }
		 
//Array List with Object data type
		
		  List<Object> oList = new ArrayList<Object>(); oList.add("Test1");
		  oList.add(1255); oList.add(true); oList.add(100.55);
		  
		  for(Object obj : oList) { System.out.println(obj); }
		  
		  Iterator<Object> itr3 = oList.iterator(); while(itr3.hasNext()) {
		  System.out.println(itr3.next()); }
		 

//Add-all method

		
		  List<Object> L1= new ArrayList<Object>();
		  
		  L1.add("Chennai"); L1.add("Bengaluru"); L1.add("Mumbai");
		  L1.add("Karaikudi"); L1.add(40000);
		  
		  List<Integer> L2= new ArrayList<Integer>();
		  
		  L2.add(60001); L2.add(56010); L2.add(40000); L2.add(63001);
		  
		  //Add second list to fist list
		  
		  L1.addAll(L2); 
// Remove all the data of second list from first list
		  L1.removeAll(L2);
//Retain all the data which are same 
		  L1.retainAll(L2);
		  Iterator<Object> itr4 = L1.iterator(); while(itr4.hasNext()) {
		  System.out.println(itr4.next()); }
		 

//Different types of adding method
		List<Integer> L3= new ArrayList<Integer>();
		L3.add(123);
		L3.add(Integer.valueOf(456));
		L3.add(2,789); // add the value based on index
		
//Set the value to Arraylist
		L3.set(1, 457);
		
System.out.println(L3);
System.out.println(L3.get(1));

	}	

}
