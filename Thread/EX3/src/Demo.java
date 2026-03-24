public class Demo {
    public static void main(String[] args) {
        TestMultiPriority t1 = new TestMultiPriority();
        TestMultiPriority t2 = new TestMultiPriority();

        t1.setPriority(4);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

    }
}
