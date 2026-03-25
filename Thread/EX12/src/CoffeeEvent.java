public class CoffeeEvent implements Runnable {
    private String msg;

    public CoffeeEvent(String msg) {
        this.msg = msg;
    }

    public void run() {
        System.out.println("Coffee Event: " + msg);
    }
}
