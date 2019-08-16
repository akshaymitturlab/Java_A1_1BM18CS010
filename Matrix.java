import java.util.*;

class Matrix {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Dimensions of Array");
		
		int row = in.nextInt();
		int col = in.nextInt();

		int [][]A = new int [row][col];
		int [][]B = new int [row][col];

		System.out.println("Enter Elements of Array A");

		for(int i = 0; i < row; ++i) {
			for(int j = 0; j < col; ++j) {
				A[i][j] = in.nextInt();
			}
		}

		System.out.println("Enter Elements of Array B");

		for(int i = 0; i < row; ++i) {
			for(int j = 0; j < col; ++j) {
				B[i][j] = in.nextInt();
			}
		}

		System.out.println("Sum of the Two Arrays are: ");
		
		for(int i = 0; i < row; ++i) {
			for(int j = 0; j < col; ++j) {
				System.out.println(A[i][j] + B[i][j]);
			}
		}

		System.out.println("Difference of the Two Arrays are: ");
		
		for(int i = 0; i < row; ++i) {
			for(int j = 0; j < col; ++j) {
				System.out.println(A[i][j] - B[i][j]);
			}
		}
	}
}
