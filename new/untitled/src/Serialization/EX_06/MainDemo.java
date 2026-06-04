package Serialization.EX_06;

public class MainDemo {
    public static void main(String[] args) {
        Car car = new Car("red",120.25,1200);

        MySerializer mySerializer = new MySerializer();
        mySerializer.vehicalserilazer(car);

        MyDeserializer myDeserializer = new MyDeserializer();
        myDeserializer.vehicalDeserializer();
    }
}
