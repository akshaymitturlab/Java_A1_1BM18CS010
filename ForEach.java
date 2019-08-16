import java.util.*;

class ForEach {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Dimensions of Array");
		
		int row = in.nextInt();
		int col = in.nextInt();
		int max = 0;

		int [][]A = new int [row][col];

		System.out.println("Enter Elements of Array A");

		for(int i = 0; i < row; ++i) {
			for(int j = 0; j < col; ++j) {
				A[i][j] = in.nextInt();
			}
		}
		
		for(int i[] : A) {
			for(int j : i) {
				if (j > max) max = j;
			}
		}

		System.out.println("Max Element is: " + max);
		
	}
}
