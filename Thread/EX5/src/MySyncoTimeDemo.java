public class MySyncoTimeDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTimer(),"MyTimer1");
        Thread t2 = new Thread(new MyTimer(),"MyTimer2");

        t1.start();
        t2.start();

    }
}