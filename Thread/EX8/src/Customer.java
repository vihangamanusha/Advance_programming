public class Customer {
    private double balance;
    private double Wamount;
    private double Damount;

    public synchronized void withdraw(double amount) {
        balance=Account.getBalance();
        Wamount=amount;

        if(Wamount>balance){
            System.out.println("Withdraw Failed : insuffient balance ");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void deposit(double amount) {
        balance=Account.getBalance();
        System.out.println("your current balance is "+balance);
        Damount=amount;
        balance=balance-amount;
        if(Wamount<balance){
            notify();
            System.out.println("withdrawa succesful");
        }else{
            System.out.println("insufficient balance");
        }
    }
}
