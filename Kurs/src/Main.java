
public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        Thread t1 = new meinThread1();
        Thread t2 = new meinThread1();
        Thread t3 = new meinThread1();
        Thread t4 = new meinThread1();
        Thread t5 = new meinThread1();
        Thread t6 = new meinThread1();
        
        t1.start();
        System.out.println("Current Thread 1: "  + Thread.currentThread().getName());
        t2.start();
        System.out.println("Current Thread 2: "  + Thread.currentThread().getName());
        t3.start();
        System.out.println("Current Thread 3: "  + Thread.currentThread().getName());
        t4.start();
        System.out.println("Current Thread 4: "  + Thread.currentThread().getName());
        t5.start();
        System.out.println("Current Thread 5: "  + Thread.currentThread().getName());
        t6.start();
        System.out.println("Current Thread 6: "  + Thread.currentThread().getName());
    }
}
