package Observer.flexibleobser;

public class Demo {
    public static void main(String[] args) {
        Teclms myTeclms = new Teclms();

        Student s1=new Student("John Doe");
        Student s2=new Student("Jane Doe");
        Student s3=new Student("Jane Doe");

        myTeclms.registerObserver(s1);
        myTeclms.registerObserver(s2);
        myTeclms.registerObserver(s3);

        myTeclms.sendmessage();
    }
}
