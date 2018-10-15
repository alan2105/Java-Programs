package inheritance;

public class Child2 extends Child1 {

	public static void main(String[] args) {
		
	//Multiple Inheritance
		
Child1 c1 = new Child1();
c1.address();
c1.Studies();
System.out.println(c1.a);

/*Parent p = new Parent();
p.address();*/
	}

}
