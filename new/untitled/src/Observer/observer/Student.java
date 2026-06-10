package Observer.observer;

public class Student implements MyObserver {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(int temp, String msg) {
        System.out.println("i am student: "+name + msg);
    }
}
