package date.pack;

import java.util.Locale;
import java.util.ResourceBundle;

public class Resource{

	public static void main(String[] args) {
	String resourceName="RBExample";
	ResourceBundle rb;
	  rb=ResourceBundle.getBundle(resourceName);
	  System.out.println("Default:" +rb.getString("hello.text"));
	  
	  rb=ResourceBundle.getBundle(resourceName, Locale.GERMANY);
	  System.out.println("german:" +rb.getString("hello.text"));
	  
	  
	  rb=ResourceBundle.getBundle(resourceName, Locale.CANADA);
	  System.out.println("canadian:" +rb.getString("hello.text"));
	  

	}

}
