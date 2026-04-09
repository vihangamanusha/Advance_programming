package Thread1;

public class ThreadDemo {
    public static void main(String[] args) {
        Mythread mt = new Mythread();
        mt.start();
        try {
            mt.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main end");
    }
}
