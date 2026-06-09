package Thread.Ex3_1;

import Thread.Ex3.MainDemoo;

public class ThreadNewDemo {
    public static void main(String[] args) {
        Thread_new thread1 = new Thread_new();
        Thread_new thread2 = new Thread_new();

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
