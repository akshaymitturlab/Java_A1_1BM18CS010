import java.util.*;

class Customer {
    private int customer_number, quantity;
    private float price, total_price, discount, net_price;
    private String customer_name;
    
    Customer(int num, String name) {
        customer_number = num;
        customer_name = name;
    }
    
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Quantity, Price");
        quantity = sc.nextInt();
        price = sc.nextFloat();
        calDisc();
    }
    
    void calDisc() {
        total_price = price * quantity;
        
        if (total_price >= 25000) discount = (float) 0.10;
        else if (total_price >= 50000) discount = (float) 0.25;
        else discount = 0;
        
        net_price = total_price - (total_price * discount);
    }
    
    void show() {
        System.out.println(customer_number + " " + quantity + " " + price + " " + total_price + " " + discount + " " + net_price + " " + customer_name);
    }
}

public class Customer {
	public static void main(String[] args) {
	    int n;
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
		Customer obj[] = new Customer[n];
		
		for (int i = 0; i < n; ++i) {
		    obj[i] = new Customer(5, "Akshay");
		    obj[i].input();
		    obj[i].show();
		}
	}
}
