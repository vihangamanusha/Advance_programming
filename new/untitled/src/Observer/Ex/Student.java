package Observer.Ex;

public class Student implements MyObserver{
    private String name;

    public Student(String name){
        this.name=name;
    }

    @Override
    public void update(int temp, String condition) {
        System.out.println(
                "[user :"+name +"] notification: it is "+ condition +"]"
        );
    }
}
