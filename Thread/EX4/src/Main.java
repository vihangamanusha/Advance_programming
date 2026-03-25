public class Main {
    public static void main(String[] args) {

        PrintNumbers obj1 = new PrintNumbers();
        PrintNumbers obj2 = new PrintNumbers();

        obj1.setName("Low Priority Thread");
        obj2.setName("High Priority Thread");


        obj1.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();
    }
}