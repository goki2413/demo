package datetask.pack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class DobToAge {
	
	public static void main(String[] args) throws ParseException {
		
	
	
	 String s = "1998/07/13"; 
	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); 
	 Date d = sdf.parse(s); 
	 
	 System.out.println(d);
	 Calendar c = Calendar.getInstance();
	 c.setTime(d); 
	 int year = c.get(Calendar.YEAR); 
	 int month = c.get(Calendar.MONTH) + 1; 
	 int date = c.get(Calendar.DATE); 
	 
	 LocalDate original = LocalDate.of(year, month, date); 
	 LocalDate now = LocalDate.now(); 
	 System.out.println(now);
	 Period diff = Period.between(original, now);
	 System.out.println("age:" + diff.getYears() + "years"); 
	 
	 


}

}
