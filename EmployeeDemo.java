import java.util.*;

class Employee {
    long employee_number;
    String employee_name;
    double basic, da, it, net;
    
    Employee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Number, Name, Basic Salary");
        employee_number = sc.nextLong();
        employee_name = sc.next();
        basic = sc.nextDouble();
    }
    
    double calculateNet() {
        da = 0.75 * basic;
        it = 0.3 * (basic + da);
        net = basic + da - it;
        return net;
    }
    
    void printDetails() {
        System.out.println("Employee Number, Name, Basic Salary, DA, IT, Net Salary Are: ");
        System.out.println(employee_number);
        System.out.println(employee_name);
        System.out.println(basic);
        System.out.println(da);
        System.out.println(it);
        System.out.println(net);
    }
}



public class Emplyee Demo
{
	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Employees");
		n = sc.nextInt();
		
		Employee[] empl = new Employee[n];
		
		for (int i = 0; i < n; ++i) {
		    empl[i] = new Employee();
		    empl[i].calculateNet();
		    empl[i].printDetails();
		}
		
	}
}