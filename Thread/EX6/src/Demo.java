public class Demo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        Thread t1=new Thread(()->acc.withdraw(80),"thread1");
        Thread t2=new Thread(()->acc.withdraw(20),"thread2");

        t1.start();
        t2.start();

    }
}