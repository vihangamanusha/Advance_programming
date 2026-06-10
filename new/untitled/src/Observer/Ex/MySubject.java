package Observer.Ex;

public interface MySubject {
    void registerObserver(MyObserver observer);
    void removeObserver(MyObserver observer);
    void notiyObservers();
}
