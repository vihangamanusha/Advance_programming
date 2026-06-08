package Thread.Join;

import Thread.Extending_thread_class.MyThread;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Mythreadnew myThread = new Mythreadnew();
        myThread.start();
        myThread.join();
        System.out.println("main end");

    }
}
