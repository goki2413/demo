
package day7.pack;



public class Student {
	
	int id;
	String name;
	long mobilenum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobilenum() {
		return mobilenum;
	}
	public void setMobilenum(long mobilenum) {
		this.mobilenum = mobilenum;
	}
	public String toString(){
		return "name:" + name  + "id:" + id +"mobilenum" + mobilenum;
		
	}
	public	int hashCode(){
		       return 12;
		       
		}
		public boolean equals(Object ob){
			
			
			
			boolean flag=false;
				Student stud=(Student) ob;
				if((this.id==stud.id)&& ((this.name)).equals(stud.name))
					flag=true;
				return flag;
				
		
	}
	
}

