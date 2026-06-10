package Observer.Ex;

import Observer.observer.MyObserver;
import Observer.observer.Mysubject;

import java.util.ArrayList;
import java.util.List;

public class WhetherStation implements Mysubject {

    private List<MyObserver> students=new ArrayList<>();
    private int temp;
    private String condition;


    public void settemperture(int temp) {
        this.temp=temp;

        if(temp<=15){
            condition="cold day";
        }else if(temp<=30){
            condition="normal day";
        }else {
            condition="hot day";
        }

        notifyObservers();
    }

    @Override
    public void registerObserver(Student observer) {
        students.add((MyObserver) observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
         students.remove(observer);
    }

    @Override
    public void notifyObservers() {
         for(MyObserver student:students){
             student.update(temp,condition);
         }
    }


}
