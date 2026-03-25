public class MyTimer implements Runnable {
    private int curTime;

    public MyTimer(int curTime) {
        this.curTime = curTime;
    }
    public void run() {
        System.out.println("Time Elapsed: " + curTime);
    }
}
