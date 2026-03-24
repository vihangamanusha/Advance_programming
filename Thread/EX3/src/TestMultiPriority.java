public class TestMultiPriority extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
        System.out.println("Prority is " +Thread.currentThread().getPriority());
    }
}
