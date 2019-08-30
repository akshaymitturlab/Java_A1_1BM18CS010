import java.util.*;

class Book {
	String name,author;
	int pages;
	double price;
	
	Book() {
		name = null;
		author = null;
		pages = 0;
		price = 0.0;
	}
	
	void setData() {
		Scanner in = new Scanner(System.in);
		name = in.next();
		author = in.next();
		pages = in.nextInt();
		price = in.nextFloat();
	}
	
	public String toString() {
		String str = ("NAME:  " + name + "\n AUTHOR:  " + author + "\n PAGES:  " + pages + "\n PRICE:  " + price);
		return str;
	}
	void getData() {
		String str = toString();
		System.out.println(str);
	}
}
public class BookDemo {
	public static void main(String args[]) {
    	Scanner in = new Scanner(System.in);
    	
    	System.out.print("Enter Number of Books: ");
    	int n = in.nextInt();
    	Book b[] = new Book[n];
    	for (int i = 0;i < n; i++) {
    		b[i]=new Book();
    	}
    	for (int i = 0; i < n; i++) {
    		System.out.println("Enter Name, Author, Pages and Price of Book:  " + (i + 1));
    		b[i].setData();
    	}
    	for (int i = 0; i < n; i++) {
    		System.out.println("Details of Book: " + (i + 1));
    		b[i].getData();
    	}
    }
}
