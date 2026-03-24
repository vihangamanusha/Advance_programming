public class Main {
    public static void main(String[] args) {
        PrintNumbers p1 = new PrintNumbers();
        PrintNumbers p2 = new PrintNumbers();


        p2.setName("Low priority");
        p1.setName("High priority");


        p2.setPriority(Thread.MIN_PRIORITY);
        p1.setPriority(Thread.MAX_PRIORITY);


        p2.start();
        p1.start();
    }
}
