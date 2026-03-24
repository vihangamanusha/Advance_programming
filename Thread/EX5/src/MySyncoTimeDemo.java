public class MySyncoTimeDemo {
    public static void main(String[] args) {
        MyTimer mt1=new MyTimer();
        MyTimer mt2=new MyTimer();

        Thread t1=new Thread(mt1);
        Thread t2=new Thread(mt2);

        t1.setName("my timer 1");
        t2.setName("my timer 2");

        //Thread t2=new Thread(new MyTimer(),"my timer 2");

        t1.start();
        t2.start();

    }
}
