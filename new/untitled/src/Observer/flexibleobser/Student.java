package Observer.flexibleobser;

public class Student implements MyObserver {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println("Student: " + name + " " + msg);
    }
}
