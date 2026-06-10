package Observer.observer;

import Observer.Ex.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Myteclms implements Mysubject {
    private List<MyObserver> students = new ArrayList<>();

    private String msg;

    @Override
    public void registerObserver(Student observer) {
        students.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
        students.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (MyObserver student : students) {
            student.update(temp, msg);
        }
    }

    public void sendMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Message");
        msg = sc.nextLine();

        notifyObservers();
    }
}
