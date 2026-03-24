import static java.lang.Character.getName;

public class MainDemo {
    public static void main(String[] args) {
        Thread t1=new Thread(new ThreadExample(), "Thread1");
        Thread t2=new Thread(new ThreadExample(), "Thread2");

        /*System.out.println("starting "+t1.getName());
        t1.run();
        System.out.println("starting "+t2.getName());
        t2.run();*/

        System.out.println("starting "+t1.getName());
        t1.start();
        System.out.println("starting "+t2.getName());
        t2.start();
    }
}
