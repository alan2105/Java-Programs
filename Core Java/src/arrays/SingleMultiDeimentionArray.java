package arrays;

public class SingleMultiDeimentionArray {

	public static void main(String[] args) {
		
	/*	int a[] = new int[5];
		a[0]=2;
		a[1]=6;
		a[2]=8;
		a[3]=15;
		a[4]=9;
		
		int b[]= {1,2,3,4,16,256,456,};
		
		for(int i=0;i<a.length;i++)
		{
		
		System.out.println(a[i]);
		}
		for(int i=0;i<b.length;i++)
		{
		
		System.out.println(b[i]);
		}
		*/
		//Multi-Dimensional Array
		
		String colors[][] = new String[2][3];
		colors[0][0]= "Green";
		colors[0][1]= "Blue";
		colors[0][2]= "White";
		colors[1][0]= "Black";
		colors[1][1]= "Red";
		colors[1][2]= "Yellow";
		System.out.println(colors[1][0]);
		
		for(int i=0;i<2;i++) //Row
		{
			for(int j=0;j<3;j++) // Column
				
			
			{
				System.out.println(colors[i][j]);
				
			}
		}
	    
	    				
		

	}

}
