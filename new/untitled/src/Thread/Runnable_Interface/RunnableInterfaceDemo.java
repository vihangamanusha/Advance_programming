package Thread.Runnable_Interface;

public class RunnableInterfaceDemo {
    public static void main(String[] args) {
        RunnableThread rt = new RunnableThread();
        Thread t = new Thread(rt);
        t.start();
    }

}
