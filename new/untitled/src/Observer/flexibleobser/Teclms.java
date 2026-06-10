package Observer.flexibleobser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teclms implements Mysubject {
    private List<MyObserver>students=new ArrayList<>();

    private String msg;

    @Override
    public void registerObserver(MyObserver observer) {
        students.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
        students.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(MyObserver student : students){
            student.update(msg);
        }
    }


    public void sendmessage(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter message: ");
        msg=sc.nextLine();

        notifyObservers();

    }
}
