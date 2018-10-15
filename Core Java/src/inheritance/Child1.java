package inheritance;

public class Child1 extends Parent{

	public static void main(String[] args) {
		
		//Single Inheritance - Inherit Method
		Parent p = new Parent();
		p.address();
		p.MobileNO();
		//Inherit a Variable
	System.out.print(p.a);

	}
	
	public void Studies()
	{
		System.out.println("HSC");
	}

	public void Games()
	{
		System.out.println("Football, Hockey");
	}


}
