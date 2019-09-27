package pp;

public class Bank {
	public float balance;
	
	public Bank(float balance) {
		this.balance = balance;
	}
	public void deposit(float dep) {
		balance += dep;
	}
	public void withdraw(float with) {
		balance -= with;
	}
}
