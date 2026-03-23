public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("thread run in main class");
        Test t1=new Test();
        Test t2=new Test();

        t1.start();
        t2.start();
    }
}
