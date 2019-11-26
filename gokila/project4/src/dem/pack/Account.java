package dem.pack;

abstract public class Account {
	private long accNum;
	protected double balance;
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

	void deposit(double d)
	{
		balance=balance+d;
		
	}
	
	
	
	abstract void withdraw(double d1);
	
}
	
	


