import java.util.*;

class Student {
    int m, n;
    float mat[][];
    
    Student() {
        Scanner in = new Scanner(System.in);
        
        m = in.nextInt();
        n = in.nextInt();
        mat = new float [m + 2][n + 2];
        
        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                mat[i][j] = in.nextFloat();
            }
        }
    }
    
    void calcResults() {
        float sum = 0;
        
        for(int i = 0; i < m; ++i) {
            for(int j = 0; j <= n; ++j) {
                if (j == n) {
                    mat[i][n] = sum;
                    mat[i][n + 1] = sum / n;
                } else sum += mat[i][j];
            }
            sum = 0;
        }
        
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j <= m; ++j) {
                if (j == m) {
                    mat[m][j] = sum;
                    mat[m + 1][j] = sum / m;
                } else sum += mat[i][j];
            }
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
