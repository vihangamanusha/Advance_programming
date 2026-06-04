package Serialization.EX_04;

import java.io.Serializable;

public class UniEmployee extends Employee implements Serializable {
    private int uniId;

    public UniEmployee(String name,int age,int uniId) {
        super(name,age);
        this.uniId = uniId;
    }

    public int getUniId() {
        return uniId;
    }

    public void setUniId(int uniId) {
        this.uniId = uniId;
    }
}
