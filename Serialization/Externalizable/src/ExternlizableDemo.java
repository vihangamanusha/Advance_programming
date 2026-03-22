public class ExternlizableDemo {
    public static void main(String[] args) {
        Car car = new Car("Red", 1.5);
        car.setWeight(2485);

        MySerialization serialization = new MySerialization();
        serialization.serialize(car);

        MyDeserilization deserilization = new MyDeserilization();
        deserilization.deserilize();
    }
}
