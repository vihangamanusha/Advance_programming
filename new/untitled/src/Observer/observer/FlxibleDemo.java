package Observer.observer;

public class FlxibleDemo {
    public static void main(String[] args) {
        Myteclms lms=new Myteclms();

        Student stu1=new Student("kamal");
        Student stu2=new Student("amal");
        Student stu3=new Student("kasun");

        /*lms.registerObserver(stu1);
        lms.registerObserver(stu2);
        lms.registerObserver(stu3);*/

        lms.sendMessage();
    }
}
