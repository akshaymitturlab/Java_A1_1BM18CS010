import java.util.*;

public class SemiPrime
{
    static boolean isSemiPrime(int n) {
        int d1, d2;
        for (d1 = 2; d1 < (int) (Math.pow(n, 0.5) + 1); ++d1) {
            if (n % d1 == 0) {
                d2 = n / d1;
                return (isPrime(d1) && isPrime(d2) && d1 != d2);
            }
        }
        return false;
    }
    
    static boolean isPrime(int n) {
        if (n == 2 || n == 3) return true;
        if (n < 2 || n % 2 == 0) return false;
        if (n < 9) return true;
        if (n % 3 == 0) return false;
        
        int r = (int) Math.pow(n, 0.5);
        int f = 5;
        
        while (f <= r) {
            if (n % f == 0) return false;
            if (n % (f + 2) == 0) return false;
            f += 6;
        }
        return true;
    }
    
    static void input() {
        int arr[] = new int[100];
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        int count = 0, flag = 0;

        for (int i = 0; i < 200; i++) {
            if (isSemiPrime(i)) {
                arr[count] = i;
                ++count;
            }
        }
        
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr.length; ++j) {
                if (arr[i] + arr[j] == num) flag = 1;
            }
        }
        
        if (flag == 0) System.out.println("No!");
        else System.out.println("Yes!");
    }
    
	public static void main(String[] args) {
		input();
	}
}
	public static void main(String[] args) {
		input();
	}
}
