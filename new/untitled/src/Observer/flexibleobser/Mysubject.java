package Observer.flexibleobser;

public interface Mysubject {
    void registerObserver(MyObserver observer);
    void removeObserver(MyObserver observer);
    void notifyObservers();
}
