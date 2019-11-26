package dem.pack;

class MinBalException extends Exception{
	public String toString(){
		return "MinBalException";
	}
}


public class Savings extends Account {
	final  double MIN_BALANCE=1000;
    Account accHolder;
    
	public String toString() {
		
		return "balance:" +balance;
    }
	
	public Account getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Account accHolder) {
		this.accHolder = accHolder;
	}
	void withdraw(double d1){
try
{
		if(balance<MIN_BALANCE)
			throw new MinBalException();
		else
		balance=balance-d1;
				
}
//System.out.println("cannot withdraw");
		catch(MinBalException e){
			System.out.println(e);
		}
}
}