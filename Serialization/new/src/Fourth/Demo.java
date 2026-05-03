package Fourth;

public class Demo {
    public static void main(String[] args) {
        Uniemployee un = new Uniemployee("vihanga",24,"456");

        Myserializer myserializer = new Myserializer();
        myserializer.Myserialize(un);

        Mydeserializer mydeserializer = new Mydeserializer();
        mydeserializer.Mydeserialize();

    }
}
