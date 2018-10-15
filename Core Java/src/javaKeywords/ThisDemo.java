package javaKeywords;

public class ThisDemo {
	
 int a=0,b = 10;
 
 public  void getResults()
 {
	 int a= 5,b=7,c = 9;
	 int s = c+this.a+this.b + a+b;
	 System.out.println(s);
	 
	 
 }

	public static void main(String[] args) {
		
		ThisDemo td = new ThisDemo();
		td.getResults();
	}

}
