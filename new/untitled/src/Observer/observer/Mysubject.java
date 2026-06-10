package Observer.observer;

import Observer.Ex.Student;

public interface Mysubject {
    void registerObserver(Student observer);

    void removeObserver(MyObserver observer);

    void notifyObservers();
}
