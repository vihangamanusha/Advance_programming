package Thread.Ex4;

public class demo {
    public static void main(String[] args) {
        printnumber thread1 = new printnumber();
        printnumber thread2 = new printnumber();

        thread1.setName("low priority thread");
        thread2.setName("high priority thread");

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
