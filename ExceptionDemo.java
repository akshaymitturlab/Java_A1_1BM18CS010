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
        do {
            Fage = sc.nextInt();
            if (Fage <= 0 ) System.out.println("Enter Valid Age");
        } while (Fage <= 0);
    }
} 

class Son extends Father {
    int Sage;
    
    Son() throws WrongAge {
        Scanner sc = new Scanner(System.in);
        do {
            Sage = sc.nextInt();
            if (Sage <= 0 ) System.out.println("Enter Valid Age");
        } while (Sage <= 0);
        
        if (Sage == Fage) throw new WrongAge("LOL");
    }
}

public class Main {
	public static void main(String[] args) {
	    try {
	        Son ob = new Son();   
	    }
	    catch(WrongAge e) {
	        System.out.println(e);
	    }
	}
}
