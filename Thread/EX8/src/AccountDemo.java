public class AccountDemo {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Thread t1=new Thread(()-> customer.withdraw(1000));
        Thread t2=new Thread(()-> customer.deposit(500));
        Thread t3=new Thread(()-> customer.deposit(700));

        t1.start();
        t2.start();
        t3.start();
    }
}
