import java.util.*;

class Sort {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int arr[] = new int [50];
		int n;

		System.out.println("Enter Length of Array");
		n = in.nextInt();

		System.out.println("Enter Elements of Array");
		for(int i = 0; i < n; ++i){
			arr[i] = in.nextInt();
		}

		for (int i = 0; i < n -1; ++i) {
			for (int j = 0; j < n-i-1; ++j) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}


		System.out.println("Sorted Array is:");

		for(int i = 0; i < n; ++i) {
			System.out.println(arr[i]);
		}
	}
}
