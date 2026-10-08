package JavaBasics;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender12Months {
	
	 public static void main(String[] args) {

	        Calendar c = Calendar.getInstance();

	        // January se start
	        c.set(Calendar.MONTH, Calendar.JANUARY);

	        SimpleDateFormat sdf = new SimpleDateFormat("MMMM");

	        for (int i = 1; i <= 12; i++) {

	            System.out.println(sdf.format(c.getTime()));

	            c.add(Calendar.MONTH, 1);
	        }
	    }

}
