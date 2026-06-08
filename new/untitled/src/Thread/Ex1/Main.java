package Thread.Ex1;

public class Main {
    public static void main(String[] args) {
        System.out.println("main is running");
        Test t1=new Test();
        Test t2=new Test();

        t1.start();
        t2.start();
    }
}
