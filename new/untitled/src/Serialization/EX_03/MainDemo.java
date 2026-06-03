package Serialization.EX_03;

public class MainDemo {
    public static void main(String[] args) {
        Dog d=new Dog(20.25,"brown");

        MySerializer mySerializer = new MySerializer();
        mySerializer.myserializerdog(d);

        MyDeserializer myDeserializer = new MyDeserializer();
        myDeserializer.mydeserialzerdog();
    }
}
