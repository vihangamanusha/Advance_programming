package Serialization.EX_05;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UniEmployee extends Employee implements Serializable {
    private int uniId;

    public UniEmployee(String name, int age, int uniId) {
        super(name, age);
        this.uniId = uniId;
    }

    public int getUniId() {
        return uniId;
    }

    public void setUniId(int uniId) {
        this.uniId = uniId;
    }

    private void writeObject(ObjectOutputStream out)throws IOException {
      try {
          out.defaultWriteObject();
          out.writeObject(getName());
          out.writeInt(getAge());
          out.writeInt(getUniId());
      }catch (IOException e){
          e.printStackTrace();
      }
    }


    private void readObject(ObjectInputStream in)throws IOException{
        try {
            in.defaultReadObject();
            setName((String)in.readObject());
            setAge(in.readInt());
            setUniId(in.readInt());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return " uniId: " + getUniId() + " name: " + getName() + " age: " + getAge();
    }
}
