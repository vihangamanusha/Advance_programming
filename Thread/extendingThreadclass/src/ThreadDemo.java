public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();

       for (int i = 0; i < 5; i++) {
           System.out.println("Main thread :"+i);
       }

    }
}
