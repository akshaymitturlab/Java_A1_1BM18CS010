import java.util.*;

class Student {
    int m, n;
    float mat[][];
    
    Student() {
        Scanner in = new Scanner(System.in);
        
        m = in.nextInt();
        n = in.nextInt();
        mat = new float [m + 2][n + 2];
        
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                mat[i][j] = in.nextFloat();
            }
        }
    }
    
    void calcResults() {
        float sum = 0;
        
        for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				sum += mat[i][j];
			}
			mat[i][n] = sum;
			mat[i][n+1] = (float) sum / n;
			sum = 0;
	}
        
       for (int j = 0; j < n; j++) {
		for (int i = 0; i < m; i++) {
				sum += mat[i][j];
		}
		mat[m][j] = sum;
		mat[n+1][j] = (float) sum / m;;
		sum = 0;
		}
        
        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                System.out.println(mat[i][j]);
            }
        } 
        
    }
}

public class StudentMarksDemo {
	public static void main(String[] args) {
	    Student ob1 = new Student();
	    ob1.calcResults();
	}
}
