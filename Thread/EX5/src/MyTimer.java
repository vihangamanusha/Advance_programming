public class MyTimer implements Runnable {
    public void run() {
        this.printNumber();
        //this.printDeNumbers();
    }

    public synchronized void printNumber(){
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void printDeNumbers(){
        for(int i=10;i>0;i--){
            System.out.println(Thread.currentThread().getName()+" de "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}