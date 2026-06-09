package Thread.Ex5;

public class MyTimer implements Runnable {
    public void run() {
        printNumbers();
        printDeNumers();

    }

    public synchronized void printNumbers() {
        for(int i=1;i<=10;i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void printDeNumers() {
        for(int i=1;i<=10;i++) {
            System.out.println(Thread.currentThread().getName()+" de "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
