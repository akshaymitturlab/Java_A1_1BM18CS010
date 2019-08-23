import java.util.*;

class Student {
    String usn, name;
    int subs;
    int[] credits, marks;
    float sgpa;
    
    Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter USN, Name, Number of Subjects");
        
        usn = in.next();
        name = in.next();
        subs = in.nextInt();
        
        marks = new int[subs];
        credits = new int[subs];
        
        System.out.println("Enter Marks and Credits Correspondingly");
        
        for (int i = 0; i < subs; ++i) {
            marks[i] = in.nextInt();
            credits[i] = in.nextInt();
        }        
    }
    Student(String usn, String name, int subs) {
        Scanner in = new Scanner(System.in);
        
        this.usn = usn;
        this.name = name;
        this.subs = subs;
        marks = new int[subs];
        credits = new int[subs];
        
        System.out.println("Enter Marks and Credits Correspondingly");
        
        for (int i = 0; i < subs; ++i) {
            marks[i] = in.nextInt();
            credits[i] = in.nextInt();
        }        
    }
    
    void calcGpa() {
        float sop = 0, totalcred = 0;
        int grade;
        
        for (int i = 0; i < subs; ++i) {
            if (marks[i] >= 90) grade = 10;
            else if (marks[i] >= 75 && marks[i] < 90) grade = 9;
            else if (marks[i] >= 60 && marks[i] < 75) grade = 8;
            else if (marks[i] >= 50 && marks[i] < 60) grade = 7;
            else if (marks[i] >= 40 && marks[i] < 50) grade = 6;
            else grade = 0;
        
            sop += grade * credits[i];
            totalcred += credits[i]; 
        }
        
        sgpa = sop / totalcred;
    }
    
    void printDetails() {
    System.out.println("USN: " + usn);
    System.out.println("Name: " + name);
    System.out.println("Number of Subjects: " + subs);
    System.out.println("Marks: ");
    
    for (int i = 0; i < subs; ++i) {
            System.out.println(marks[i]);
        }
        
    System.out.println("SGPA: " + sgpa);
    } 
}

class StudentDemo {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.calcGpa();
        s1.printDetails();
        
        Student s2 = new Student("1BM18CS010", "Akshay", 5);
        s2.calcGpa();
        s2.printDetails();
    }
}
