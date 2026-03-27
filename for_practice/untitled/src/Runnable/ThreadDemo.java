package Runnable;

public class ThreadDemo {
    public static void main(String[] args) {
        Mythread mt = new Mythread();
        Mythread mt2 = new Mythread();

        mt.start();
        mt2.start();
    }
}