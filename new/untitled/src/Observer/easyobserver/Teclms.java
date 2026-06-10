package Observer.easyobserver;

import java.util.Observable;
import java.util.Scanner;

public class Teclms extends Observable {
    public String message;
    Scanner sc=new Scanner(System.in);

    public void sendmessage(){
        System.out.println("Enter the message");
        message=sc.nextLine();
        setChanged();
        notifyObservers(message);
    }
}
