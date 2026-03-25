public class MyTask implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName()+" running");
    }
}
