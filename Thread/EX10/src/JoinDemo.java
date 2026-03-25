public class JoinDemo {
    public static void main(String[] args) {
        Example example = new Example();

        Thread t1 = new Thread(example, "Thread1");
        Thread t2 = new Thread(example,"Thread2");

        t1.start();
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
