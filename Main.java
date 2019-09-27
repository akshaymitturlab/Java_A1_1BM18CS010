import pp.*;

class Employee extends Bank {
	Employee() {
		super(100);
		System.out.println("Succcessful");
	}
}

class Main {
	public static void main(String args[]) {
		Bank ob = new Employee();
		ob.deposit(50);
		ob.withdraw(100);
		System.out.println(ob.balance);
	}
}
