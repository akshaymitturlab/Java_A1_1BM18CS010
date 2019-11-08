import CIE.Internals;
import SEE.External;
import java.util.*;

class PackageDemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Internals in[] = new Internals[n];
		External ex[] = new External[n];
		
		for (int i = 0; i < n; ++i) {
			in[i] = new Internals();
			ex[i] = new External();
		}
	}
}
