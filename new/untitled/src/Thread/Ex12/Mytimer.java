package Thread.Ex12;

public class Mytimer implements Runnable {
    private int curtime;

    public Mytimer(int curtime) {
        this.curtime = curtime;
    }
    public void run() {
        System.out.println(curtime);
    }
}
