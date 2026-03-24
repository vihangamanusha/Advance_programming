public class Demo {
    public static void main(String[] args) {
        Thread  t=new Thread();
        t.setPriority(6);
        System.out.println(t.getPriority());
        t.start();
    }
}
