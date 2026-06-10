package RMII.newnew;

import java.io.Serializable;

public class Student implements Serializable {
    private String stu_id;
    private String stu_name;
    private String stu_address;

    public Student(String stu_id, String stu_name, String stu_address) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.stu_address = stu_address;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_address() {
        return stu_address;
    }

    public void setStu_address(String stu_address) {
        this.stu_address = stu_address;
    }

    @Override
    public String toString() {
        return "student [stu_id=" + getStu_id() + ", stu_name=" + getStu_name() + ", stu_address="+getStu_address()+"]";
    }
}
