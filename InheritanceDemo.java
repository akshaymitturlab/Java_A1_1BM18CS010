import java.util.*;

class Account {
    String name;
    int cusid;
    double balance;
    
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name, ID, Balance");
        
        name = sc.next();
        cusid = sc.nextInt();
        balance = sc.nextFloat();
    }
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + cusid);
        System.out.println("Balance:  " + balance);
    }
}

class Savings extends Account {
    float rate, time, interest;
    
    void getData() {
        super.getData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Time, Rate");
        
        time = sc.nextFloat();
        rate = sc.nextFloat();
    }
    
    void compute() {
        interest = (float) balance * time * rate / 100;
    }
    
    void display() {
        super.display();
        System.out.println("Rate:  " + rate);
        System.out.println("Time:  " + time);
        System.out.println("Interest:  " + interest);
    }
}

public class InheritanceDemo {
    public static void main(String Args[]) {
        Savings ob = new Savings();
        
        ob.getData();
        ob.compute();
        ob.display();
    }
}
