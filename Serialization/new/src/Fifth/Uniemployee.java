package Fifth;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Uniemployee extends Employee implements Serializable {
    private int uniid;

    public Uniemployee(String name, int age, int uniid) {
        super(name, age);
        this.uniid = uniid;
    }

    public int getUniid() {
        return uniid;
    }

    public void setUniid(int uniid) {
        this.uniid = uniid;
    }


    private void writeobject(ObjectOutputStream out) {
        try {
            out.defaultWriteObject();
            out.writeObject(getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void readobject(ObjectInputStream in) {
        try {
            in.defaultReadObject();
            setName((String) in.readObject());
            setAge((int) in.readObject());
            setUniid((int) in.readObject());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String toString() {
        return "Uniemployee [name=" + getName() + ", age=" + getAge() + ", uniid=" + uniid + "]";
    }
}
