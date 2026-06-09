package Thread.Ex11;

public class Mytask implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
