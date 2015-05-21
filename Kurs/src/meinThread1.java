
public class meinThread1 extends Thread {

    public void run() {
        System.out.println("Hello world! " + this.getName());
    }
    
    public static void yield() {
        System.out.println("meinThread2 gestopt. ");
        Thread.yield();
    }
    public static void sleep(int n) throws InterruptedException {
        System.out.println("sleep ");
        Thread.sleep(n);
    }
}
