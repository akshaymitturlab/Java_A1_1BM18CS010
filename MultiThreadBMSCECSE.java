class A implements Runnable {
    Thread t;
    A() {
        t = new Thread(this, "BMSCE");
        t.start();
    }
    
    public void run() {
        try {
            while(true) {
                System.out.println("BMSCE");
                Thread.sleep(10000);
            }
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}

class B implements Runnable {
    Thread t;
    B() {
        t = new Thread(this, "CSE");
        t.start();
    }
    
    public void run() {
        try {
            while(true) {
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class MultiThreadBMSCECSE {
	public static void main(String[] args) {
		new A();
		new B();
	}
}
