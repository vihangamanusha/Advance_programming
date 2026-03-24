public class BankAccount {
    int balance=100;

    public synchronized void withdraw(int amount) {
        if(balance>amount) {
            System.out.println(Thread.currentThread().getName() + ": withdrawing " + amount);
            balance=balance-amount;
            System.out.println("Remainning " + balance);
        }else{
            System.out.println("enough money to withdraw " + amount);
        }
    }
}