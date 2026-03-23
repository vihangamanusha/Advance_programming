public class Demo {
    public static void main(String[] args) {

        MyRunnable r = new MyRunnable();   // Step 1: create Runnable object

        Thread t = new Thread(r, "MyThread"); // Step 2: create Thread with name

        t.start(); // Step 3: start thread

        // Main thread work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread : " + i);
        }
    }
}