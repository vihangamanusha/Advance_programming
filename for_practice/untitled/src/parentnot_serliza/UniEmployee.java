package parentnot_serliza;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UniEmployee extends Employee implements Serializable {
     private int uniID;

    public UniEmployee(String name,int age,int uniID) {
        super(name,age);
        this.uniID = uniID;
    }

    public int getUniID() {
        return uniID;
    }

    public void setUniID(int uniID) {
        this.uniID = uniID;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(getName());
        out.writeInt(getAge());
        out.writeInt(getUniID());
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        setName((String) in.readObject());
        setAge(in.readInt());
        setUniID(in.readInt());
    }

    @Override
    public String toString() {
        return "UniEmployee [uniID=" + uniID +" \n name :" +getName()+ "\n age :" +getAge()+ "]";
    }
}
