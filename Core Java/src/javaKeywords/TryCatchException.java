package javaKeywords;

public class TryCatchException {

	public static void main(String[] args) throws ArithmeticException {
		int a = 15, b =0;
		
		try
		{
			double c= a/b;
			System.out.println(c);
			
		}
		catch(Exception e)
		{
			System.out.println("Error catched"+ e);
		}

	}

}
