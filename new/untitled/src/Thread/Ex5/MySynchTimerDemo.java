package Thread.Ex5;

public class MySynchTimerDemo {
    public static void main(String[] args) {
        Thread thread1=new Thread(new MyTimer(),"My Timer 1");
        Thread thread2=new Thread(new MyTimer(),"My Timer 2");

        thread1.start();
        thread2.start();
    }
}
