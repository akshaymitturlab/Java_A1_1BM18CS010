import java.util.*;

class Student {
    String usn, name;
    int sem;
    
    Student() {
        System.out.println("Enter USN, Name, Sem");
        Scanner sc = new Scanner(System.in);
        usn = sc.next();
        name = sc.next();
        sem = sc.nextInt();
    }
}

class Test extends Student {
    int n;
    int []ciemarks, credits;
    Test() { 
        System.out.println("Enter No. of Subjects");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ciemarks = new int[n];
        credits = new int[n];
        
        System.out.println("Enter CIE Marks & Corresponding Credits");
        for (int i = 0; i < n; ++i) {
            ciemarks[i] = sc.nextInt();
            credits[i] = sc.nextInt();
        }
    }
}

class Exam extends Test {
    int []seemarks = new int[n];
    
    Exam() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SEE Marks ");
        for (int i = 0; i < n; ++i) {
            seemarks[i] = sc.nextInt();
        }
    }
}

class Result extends Exam {
    char grade;
    int gradenum;
    float sgpa;
    
    Result() {
        grade = 'S';
        gradenum = 10;
        sgpa = 0;
    }
    
    void calGrade() {
        for (int i = 0; i < n; ++i) {
            if (seemarks[i] >= 90 && seemarks[i] <= 100) {
                grade = 'S';
                gradenum = 10;
            }
            else if (seemarks[i] >= 75 && seemarks[i] <= 90) {
                grade = 'A';
                gradenum = 9;
            }
            else if (seemarks[i] >= 60 && seemarks[i] < 75) {
                grade = 'B'; 
                gradenum = 8;
            }
            else if (seemarks[i] >= 50 && seemarks[i] < 60) {
                grade = 'C';
                gradenum = 7;
            }
            else if (seemarks[i] >= 40 && seemarks[i] < 50) {
                grade = 'D'; 
                gradenum = 6;
            }
            else {
                grade = 'F';
                gradenum = 0;
            }
            
            System.out.println("Grade is: " + grade);
            sgpa += gradenum * credits[i];
        }
        sgpa = (float) (sgpa / credits.length);
        System.out.println("SGPA is: " + sgpa / credits.length);
    }
    
}

public class Main {
	public static void main(String[] args) {
		Result ob = new Result();
		ob.calGrade();
	}
}
