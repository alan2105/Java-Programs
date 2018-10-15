package constructors;

public class ConstructorDemo {
	
	//Default Constructor
	public ConstructorDemo()
	{
		System.out.println("Default Consturctor");
	}
//Parameterized Constructor
	
	public ConstructorDemo(String str)
	{
		System.out.println(str);
	}
	public static void main(String[] args) {
		
		ConstructorDemo dc = new ConstructorDemo();
		ConstructorDemo pc = new ConstructorDemo("Parameterized");

	}

}
