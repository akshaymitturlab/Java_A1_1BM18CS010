import java.util.*;

interface Stack {
    void push();
    void pop();
    boolean checkEmpty();
}

class StackTest implements Stack {
    int size = 3;
    int s[] = new int[size];
    int top = -1;
    
    public boolean checkEmpty() {
        if (top == -1) return true;
        else return false;
    }
    
    public void push() {
        Scanner sc = new Scanner(System.in);
        int ele = sc.nextInt();
        if (top == size - 1) {
            size *= 2;
            int temp[] = new int[size];
            for (int i = 0; i < size / 2; ++i) {
                temp[i] = s[i];
            }
            s = temp;
        } 
        s[++top] = ele;
    }
    
    public void pop() {
        if (!checkEmpty()) top--;
        else System.out.println("Underflow \n");
    }
    
    public void display() {
    	for (int i = 0; i <= top; ++i) System.out.println(s[i]);
    }
}
public class StackDemo {
	public static void main(String[] args) {
		StackTest ob = new StackTest();
		ob.push();
		ob.push();
		ob.push();
		ob.push();
		ob.display();
	}
}
