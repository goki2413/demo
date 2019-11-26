package comtestexcp.pack;

public class Person {
private String firstName;
 private String secName;
 Person(){
	 
 }
 
	public Person(String f,String s){
		if(f==null && s==null){
			throw new IllegalArgumentException("both name can't be null");
		}
		this.firstName=f;
		this.secName=s;
	}
	
	
	public String getFullName(){
		String first=firstName;
		String sec=secName;
		return first+""+sec;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getSecName(){
		return this.secName;
	}
}