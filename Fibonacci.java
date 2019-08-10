import java.util.*;

class Fibonacci {

	public static void main (String args[]) {

		int count;

		Scanner inp = new Scanner(System.in);

		System.out.println("Enter nth Index of Series");
		count = inp.nextInt();
		System.out.println(fibo(count));
	}
			
	static int fibo (int count) {
		int first = 1, second = 1, third = 1;
		for (int i = 0; i < count - 2; i++) {
			third = first + second;
			first = second;
			second = third;
		} 
		return third;
	}
}
