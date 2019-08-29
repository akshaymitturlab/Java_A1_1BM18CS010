import java.util.*;

class Point {
    private double x, y;
    
    Point() {
        x = 0;
        y = 0;
    }
    
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    Point(Point obj) {
        x = obj.x;
        y = obj.y;
    }
    
    double distance(Point obj) {
        return Math.sqrt((x - obj.x) * (x - obj.x) + (y - obj.y) * (y - obj.y));
    }
}

public class PointDemo {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    double a = in.nextInt();
	    double b = in.nextInt();
	    
	    Point ob1 = new Point();
	    Point ob2 = new Point(a, b);
	    Point ob3 = new Point(ob2);
	   
	   	System.out.println(ob3.distance(ob1));
	}
}
