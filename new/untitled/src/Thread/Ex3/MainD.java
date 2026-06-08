package Thread.Ex3;

public class MainD {
    public static void main(String[] args) throws InterruptedException {
        Thread thread0=new Thread(new MainDemoo(),"Thread_0");
        Thread thread1=new Thread(new MainDemoo(),"Thread_1");

        //thread0.start();
        //thread0.join();
        //thread1.start();


    }
}
