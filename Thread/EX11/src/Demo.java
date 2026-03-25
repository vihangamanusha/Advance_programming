import java.lang.ThreadGroup;
public class Demo {
    public static void main(String[] args) {

        ThreadGroup tg = new ThreadGroup("MyGroup");

        Thread t1 = new Thread(tg, new MyTask(), "T1");
        Thread t2 = new Thread(tg, new MyTask(), "T2");

        t1.start();
        t2.start();

        System.out.println("Group Name: " + tg.getName());
    }
}