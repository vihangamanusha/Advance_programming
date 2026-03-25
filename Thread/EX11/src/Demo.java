
public class Demo {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("Demo");

        MyTask myTask = new MyTask();

        Thread t1 = new Thread(tg, myTask,"Thread1");
        Thread t2 = new Thread(tg, myTask,"Thread2");

        t1.start();
        t2.start();

        System.out.println(tg.getName()+" running");

    }
}