package Runnable;

public class Mythread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}