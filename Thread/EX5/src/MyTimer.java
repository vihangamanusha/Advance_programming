public class MyTimer implements Runnable {
    @Override
    public void run() {
        this.printDeNumbers();
        this.printNumbers();


    }

    public synchronized void  printNumbers(){
        for (int i = 1; i < 11; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }


        }
    }

    public  void printDeNumbers(){
        for (int i = 10; i > 1; i--) {
            System.out.println(Thread.currentThread().getName() + "De : " + i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
