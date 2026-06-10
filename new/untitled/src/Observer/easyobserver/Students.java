package Observer.easyobserver;

import java.util.Observable;
import java.util.Observer;

public class Students implements Observer {
    private String name;

    public Students(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Teclms){
            System.out.println("Student Name: "+name+" i got this message: "+arg);
        }

    }


}
