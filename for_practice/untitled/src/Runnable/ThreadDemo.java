package Runnable;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1=new Thread(new Mythread(), "Thread1");
        Thread t2=new Thread(new Mythread(), "Thread2");

        System.out.println("stating "+t1.getName());
        t1.run();
        System.out.println("stating "+t2.getName());
        t2.run();
    }
}