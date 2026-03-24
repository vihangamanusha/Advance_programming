public class Demo {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable,"MyRunnable");
        thread.start();
        thread.join();
        System.out.println("Main thread exiting");
    }
}