package javaKeywords;

public class SuperChild extends SuperParent{
	
	String name = "Child Variable";
	
	public void getVariable()
	{
		System.out.println(super.name); // Parent Variable
		System.out.println(name); // Child variable
		
	}
	
	public void getString()
	{	
		
		System.out.println("Child Method");
	}
	
	
	public void getMethod()
	
	{
		super.getString(); // Parent Method
		getString(); // Child Method
		
	}
	
	public SuperChild()
	{
		super(); // Parent Constructor
		System.out.println("Child Constructor"); // Child Constructor
	}
	
	

	public static void main(String[] args) {
		
		SuperChild sd = new SuperChild();
		sd.getVariable();
		sd.getMethod();
	
		
	
		

	}

}
