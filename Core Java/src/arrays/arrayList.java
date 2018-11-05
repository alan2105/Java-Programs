package arrays;
import java.util.ArrayList;

public class arrayList {
	

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String> ();
		a.add("New York");
		a.add("Rockways");
		a.add("Atlanta");
		a.add("Denton");
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.contains("New York"));
		System.out.println(a.get(2));
		System.out.println(a.isEmpty());

	}

}
