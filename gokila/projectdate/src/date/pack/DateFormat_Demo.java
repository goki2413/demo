package date.pack;

import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class DateFormat_Demo {

	public static void main(String[] args) {
		
/*Date d=new Date();
System.out.println(d);
DateFormat dt=DateFormat.getDateInstance(DateFormat.LONG);
System.out.println(dt.format(d));
SimpleDateFormat st=new SimpleDateFormat("MM");
System.out.println(st.format(d));
SimpleDateFormat stl=new SimpleDateFormat("mm");
System.out.println(stl.format(d));
DateFormat germanDate=DateFormat.getDateInstance(DateFormat.LONG, Locale.GERMAN);
System.out.println(germanDate.format(d));
System.out.println(LocalDate.now());
System.out.println(LocalTime.now());*/
	LocalDate date=LocalDate.now();
	System.out.println(date);
	DateTimeFormatter newpattern=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	String Date1=date.format(newpattern);
	System.out.println(Date1);
	
	DateTimeFormatter french=DateTimeFormatter.ofPattern("d MMMM yyyy",Locale.FRENCH);
	String frenchDate1=date.format(french);
	System.out.println(frenchDate1);
	//LocalTimeFormatter time=LocalTime.now();
	
	
	
	}
}

