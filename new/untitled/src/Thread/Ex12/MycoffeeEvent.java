package Thread.Ex12;

public class MycoffeeEvent implements Runnable {
    private String msg;

    public MycoffeeEvent(String msg) {
        this.msg = msg;
    }
    public void run() {
        System.out.println(msg);
    }
}
