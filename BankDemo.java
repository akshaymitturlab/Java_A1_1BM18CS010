import java.util.*;

class Account {
    String cusName, type;
    long accNo;
    boolean cheque;
    float amount;
    
    Account() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        cusName = sc.next();
        System.out.println("Enter Type(S/C)");
        type = sc.next();
        System.out.println("Enter Account Number");
        accNo = sc.nextLong();
    }
}

class Current extends Account {
    float balance, deposit, withdraw, minBalance, penalty;
    
    Current() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Balance");
        balance = sc.nextFloat();
        cheque = true;
        deposit = 0;
        minBalance = 1000;
        penalty = 100;
    }
    
    void dep() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Deposit");
        deposit = sc.nextFloat();
        balance += deposit;
    }
    
    void display() {
        System.out.println("Balance is: " + balance);
    }
    
    void withdrawal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Withrawal Amount");
        withdraw = sc.nextFloat();
        
        if (withdraw - balance >= minBalance) balance -= withdraw;
        else {
            System.out.println("Can't Withdraw, Penalty Imposed");
            balance -= penalty;
        }
    }
    
    void checkBal() {
        if (balance < minBalance) {
            balance -= penalty;
            System.out.println("Penalty Imposed");
        }
    }
}

class Savings extends Account {
    float compInt, rate, balance, deposit, withdraw;
    int time;
    
    Savings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rate");
        rate = sc.nextFloat();
        System.out.println("Enter Time");
        time = sc.nextInt();
        System.out.println("Enter Balance");
        balance = sc.nextFloat();
        cheque = false;
        deposit = 0;
    }
    
    void calcInterest() {
        compInt = (float) (balance * (float) Math.pow((1 + rate) / 100, time));
        balance += compInt;
    }
    
    void dep() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Deposit");
        deposit = sc.nextFloat();
        balance += deposit;
        calcInterest();
    }
    
    void display() {
        System.out.println("Balance is: " + balance);
    }
    
    void withdrawal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Withrawal Amount");
        withdraw = sc.nextFloat();
        if (withdraw <= balance) balance -= withdraw;
        else System.out.println("Can't Withdraw");
    }
}
public class BankDemo {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int ch;
		char type;
		System.out.println("Enter Type of Account (S/C)");
		type = sc.next().charAt(0);
		
		switch(type) {
		    case 'S': Savings ob1 = new Savings();
		            System.out.println("1. Deposit\n 2. Calculate Interest\n 3. Withdraw\n 4.Display");
		            ch = sc.nextInt();
		            if (ch == 1) ob1.dep();
		            else if (ch == 2) ob1.calcInterest();
		            else if (ch == 3) ob1.withdrawal();
		            else if (ch == 4) ob1.display();
		            else System.out.println("Invalid Choice");
		            break;
	        
	        case 'C': Current ob2 = new Current();
	                System.out.println("1. Deposit\n 2. Withdraw\n 3. Check Balance\n 4.Display");
		            ch = sc.nextInt();
		            if (ch == 1) ob2.dep();
		            else if (ch == 2) ob2.withdrawal();
		            else if (ch == 3) ob2.checkBal();
		            else if (ch == 4) ob2.display();
		            else System.out.println("Invalid Choice");
		            break;
		    default: System.out.println("Error");
		}
	}
}
