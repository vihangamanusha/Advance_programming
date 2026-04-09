package EXTERNERLIZABLE;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car extends Vehical implements Externalizable {
    private double speed;
    private transient double weight;

    public Car() {}

    public Car(String color,double speed, double weight) {
        super(color);
        this.speed = speed;
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(getColor());
        out.writeDouble(getSpeed());
        out.writeDouble(getWeight());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        setColor((String)in.readObject());
        setSpeed(in.readDouble());
        setWeight(in.readDouble());
    }

    @Override
    public String toString() {
        return "car [color=" + getColor() + ", speed=" + speed + ", weight=" + weight + "]";
    }
}
