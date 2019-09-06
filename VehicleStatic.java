import java.util.*;

class Vehicle {
    String model, color;
    int year;
    static int total_number_of_vehicles;
    
    Vehicle(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
        ++total_number_of_vehicles;
    }
    
    void display() {
        System.out.println("Model: " + model);
        System.out.println("Year " + year);
        System.out.println("Color:  " + color);
    }
    
    static void numbercars() {
        System.out.println("Count:  " + total_number_of_vehicles);
    }
}

public class VehicleStatic {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int n = sc.nextInt();
        Vehicle ob[] = new Vehicle[n];
        
        for (int i = 0; i < n; ++i) {
            String a = sc.next();
            int b = sc.nextInt();
            String c = sc.next();
            ob[i] = new Vehicle(a, b, c);
        }
        
        Vehicle.numbercars();
    }
}
