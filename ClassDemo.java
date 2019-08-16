import java.util.*;

class Rectangle {

	float length, breadth, area;

	Scanner in = new Scanner(System.in);

	void inputDim() {
		
		System.out.println("Enter Dimensions of Rectangle");
		length = in.nextFloat();
		breadth = in.nextFloat();
	}
	
	float computeArea() {
		
		area = length * breadth;
		return area;
	}

	void printArea() {

	System.out.println("The Area is: " + area);
	}
}

class ClassDemo {

	public static void main(String args[]) {
	
		Rectangle rect1 = new Rectangle();
		rect1.inputDim();
		rect1.computeArea();
		rect1.printArea();

		Rectangle rect2 = new Rectangle();
		rect2.inputDim();
		rect2.computeArea();
		rect2.printArea();	
	}
}
