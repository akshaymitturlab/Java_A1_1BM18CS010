import java.util.*;

public class EndSort { 
	static int moves(int arr[], int n) {
	    int item = n;
	    for (int i = n - 1; i >= 0; i--) if (arr[i] == item) item--;
	    return item;
	}
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n;
	    
	    System.out.println("Enter Size of Array: ");
	    n = sc.nextInt();
	    int arr[] = new int[n];
	    
		System.out.println("Enter Elements of Array: ");
		for(int i = 0; i < n; ++i) {
		    arr[i] = sc.nextInt();
		}
		System.out.println(moves(arr, n));
	}
}
