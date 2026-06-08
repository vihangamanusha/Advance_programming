package Thread.Passing_thread_name;

public class MyRunnableDemo {
    public static void main(String[] args) {
        Myrunnable mr = new Myrunnable();
        Thread t = new Thread(mr,"thread_01");
        t.start();
    }
}
