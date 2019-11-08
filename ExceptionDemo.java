import java.util.*;

class WrongAge extends Exception {
    String deets;
    
    WrongAge(String str) {
        deets = str;
    }
    
    public String toString() {
        return deets;
    }
}

class Father {
    int Fage;
    
    Father() {
        Scanner sc = new Scanner(System.in);
        Fage = sc.nextInt();
    }
}

class Son extends Father {
    int Sage;
    
    Son() throws WrongAge {
        Scanner sc = new Scanner(System.in);
        Sage = sc.nextInt();
        
        if (Sage == Fage) throw new WrongAge("LOL");
    }
}

public class ExceptionDemo {
	public static void main(String[] args) {
	    try {
	        Son ob = new Son();   
	    }
	    catch(WrongAge e) {
	        System.out.println(e);
	    }
	}
}
