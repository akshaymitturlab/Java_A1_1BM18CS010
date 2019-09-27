import java.util.*;

abstract class Shape {
    int l, b;
    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length and Breadth");
        l = sc.nextInt();
        b = sc.nextInt();
    }
    void printArea() {
        System.out.println("Area: " + (float) (l * b));
    }
}

class Triangle extends Shape {
    Triangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height and Base");
        l = sc.nextInt();
        b = sc.nextInt();
    }
    void printArea() {
        System.out.println("Area: " + (float) (0.5 * l * b));
    }
}

class Circle extends Shape {
    Circle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        l = sc.nextInt();
    }
    void printArea() {
        System.out.println("Area: " + (float) ((3.14159) * l * l));
    }
}

public class AbstractShape {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Triangle tri = new Triangle();
		Circle circ = new Circle();
		
		rect.printArea();
		tri.printArea();
		circ.printArea();
	}
}
