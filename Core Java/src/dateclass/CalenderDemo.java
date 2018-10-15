package dateclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		System.out.println(cl.getTime());
		System.out.println(sdf.format(cl.getTime()));
		System.out.println(cl.get(Calendar.DATE));
	}

}
