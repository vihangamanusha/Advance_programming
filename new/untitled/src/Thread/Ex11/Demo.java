package Thread.Ex11;

public class Demo {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("ThreadGroup");

        Mytask mytask = new Mytask();
        Thread t1=new Thread(group,mytask,"Thread 1");
        Thread t2=new Thread(group,mytask,"Thread 2");

        t1.start();
        t2.start();

        System.out.println(group.getName());
    }
}
