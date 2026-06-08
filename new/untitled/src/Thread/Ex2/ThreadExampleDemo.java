package Thread.Ex2;

public class ThreadExampleDemo {
    public static void main(String[] args) {
        ThreadExample t1=new ThreadExample();
        Thread t=new Thread(t1);
        t.start();
    }
}
