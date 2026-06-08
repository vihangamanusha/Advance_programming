package Thread.Passing_thread_name;

public class Myrunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
