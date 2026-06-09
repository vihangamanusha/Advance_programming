package Thread.Ex3_1;

public class Thread_new extends Thread{
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is running");
        System.out.println(Thread.currentThread().getPriority());

    }
}
