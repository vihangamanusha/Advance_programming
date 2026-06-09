package Thread.Ex10;

public class JoinDemo {
    public static void main(String[] args) {

        Thread thread = new Thread(new Example(),"Thread1 ");
        Thread thread2 = new Thread(new Example(),"Thread2 ");

        thread.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
    }
}
