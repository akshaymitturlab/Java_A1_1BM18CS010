import java.util.*;

class Time {
    int h, m, s;
    
    Time() {
        h = 0;
        m = 0;
        s = 0;
    }
    
    Time(int a, int b, int c) {
        h = a;
        m = b;
        s = c;
    }
    
    void currentTime(int a, int b, int c) {
        h = a;
        m = b;
        s = c;
    }
    
    void advance(int a, int b, int c) {
        s += c;
        m = m + b + (s/60);
        s = s%60;
        h = h + a + (m/60);
        m = m%60;
        h = h%24;
    }
    
    void print(){
        System.out.println("The Hour is: " + h);
        System.out.println("The Minute is: " + m);
        System.out.println("The Second is: " + s);
    }
}

class TimeDemo {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        char choice = 'n';
        
        do {
            System.out.println("1. Create Object Without Parameters");
            System.out.println("2. Create Object With Parameters");
            
            int hh, mm, ss;
            
            int ch = in.nextInt();
            
            switch(ch) {
            case 1: Time time1 = new Time();
            
                    System.out.println("3. Update Time");
                    System.out.println("4. Reset Time");
                    
                    int ch1 = in.nextInt();
                    
                    switch(ch1) {
                        case 3: System.out.println("Enter Hours, Minutes, Seconds to be Incremented");
                                hh = in.nextInt();
                                mm = in.nextInt();
                                ss = in.nextInt();
                                
                                time1.advance(hh, mm, ss);
                                time1.print();
                                System.out.println("Try Again? (Y/N)");
                                choice = in.next().charAt(0);
                                break;
                        case 4: System.out.println("Enter Hours, Minutes, Seconds to be Resetted");
                                hh = in.nextInt();
                                mm = in.nextInt();
                                ss = in.nextInt();
                                
                                time1.currentTime(hh, mm, ss);
                                time1.print();
                                System.out.println("Try Again? (Y/N)");
                                choice = in.next().charAt(0);
                                break;
                        default: System.out.println("Error");
                    }
                    break;
                    
            case 2: System.out.println("Enter Hour, Minutes, Seconds");
            
                    hh = in.nextInt();
                    mm = in.nextInt();
                    ss = in.nextInt();
            
                    Time time2 = new Time(hh, mm, ss);
                    
                    System.out.println("3. Update Time");
                    System.out.println("4. Reset Time");
                    
                    ch1 = in.nextInt();
                    
                    switch(ch1) {
                        case 3: System.out.println("Enter Hours, Minutes, Seconds to be Incremented");
                                hh = in.nextInt();
                                mm = in.nextInt();
                                ss = in.nextInt();
                                
                                time2.advance(hh, mm, ss);
                                time2.print();
                                System.out.println("Try Again? (Y/N)");
                                choice = in.next().charAt(0);
                                break;
                                
                        case 4: System.out.println("Enter Hours, Minutes, Seconds to be Resetted");
                                hh = in.nextInt();
                                mm = in.nextInt();
                                ss = in.nextInt();
                                
                                time2.currentTime(hh, mm, ss);
                                time2.print();
                                System.out.println("Try Again? (Y/N)");
                                choice = in.next().charAt(0);
                                break;
                        default: System.out.println("Error");
                    }
                    break;
            default: System.out.println("Error");
            }
        } while (choice == 'Y' || choice == 'y');
    }
}
