import java.util.*;

class Matrix {
    int mat[][] = new int [2][2];
    
    Matrix() {
        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i < 2; ++i) {
            for(int j = 0; j < 2; ++j) {
                mat[i][j] = in.nextInt();
            }
        }
    }
    
    Matrix(Matrix obj) {
        for(int i = 0; i < 2; ++i) {
            for(int j = 0; j < 2; ++j) {
                mat[i][j] = obj.mat[i][j];
            }
        }
    }
    
    float determinant() {
        return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
    }
    
    boolean isSingular() {
        if (determinant() != 0) return false;
        else return true;
    }
    
    void inverse() {
        if (isSingular()) {
            int temp = mat[0][0];
            mat[0][0] = mat[1][1];
            mat[1][1] = temp;
            
            mat[0][1] -= 2 * mat[0][1];
            mat[1][0] -= 2 * mat[1][0];
            
            for (int i[]: mat) {
                for (int j: i) {
                    j /= determinant();
                    System.out.println(j);
                }
            } 
        }
    }
    
    void print() {
        for (int i[]: mat) {
            for (int j: i) {
                System.out.println(j);
            }
        }
    }
}

public class MatrixDemo {
	public static void main(String[] args) {
	    Matrix ob1 = new Matrix();
	    Matrix ob2 = new Matrix(ob1);
	    
	    System.out.println(ob1.determinant());
	    System.out.println(ob1.isSingular());
	    ob1.inverse();
	    
	}
}
