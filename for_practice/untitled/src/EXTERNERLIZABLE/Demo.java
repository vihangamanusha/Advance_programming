package EXTERNERLIZABLE;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car("red",250.0,450);

        Myserialzer mys = new Myserialzer();
        mys.Myserialzercar(car);

        Mydeseralizer myd=new Mydeseralizer();
        myd.Mydeseralizercar();
    }
}
