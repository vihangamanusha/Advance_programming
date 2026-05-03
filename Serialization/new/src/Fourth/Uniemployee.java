package Fourth;

import java.io.Serializable;

public class Uniemployee extends Employee implements Serializable  {
    private String uniid;

    public Uniemployee(String name,int age, String uniid) {
        super(name,age);
        this.uniid = uniid;
    }

    public String getUniid() {
        return uniid;
    }

    public void setUniid(String uniid) {
        this.uniid = uniid;
    }

    @Override
    public String toString() {
        return "Uniemployee [name "+getName()+" age "+getAge()+" uniid "+getUniid()+"]";
    }
}
