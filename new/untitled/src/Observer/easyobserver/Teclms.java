package Observer.easyobserver;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class Teclms extends Observable {
    public String msg;
    Scanner sc=new Scanner(System.in);

    public void sendMessage(){
        System.out.println("Enter messsgae :");
        msg=sc.nextLine();
        setChanged();
        notifyObservers(msg);

    }

}
