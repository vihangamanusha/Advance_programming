package Third;

public class MainDemo {
    public static void main(String[] args) {
        Dog d=new Dog(20.0,"red");

        Myserializer myserializer=new Myserializer();
        myserializer.Myserialize(d);

        Mydeserializer mydeserializer=new Mydeserializer();
        mydeserializer.Mydeserialize();



    }
}
