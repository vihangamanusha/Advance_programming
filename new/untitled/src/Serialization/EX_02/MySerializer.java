package Serialization.EX_02;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MySerializer {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.id=1;
        stu.name="manudha";

        try{
            FileOutputStream fos=new FileOutputStream("C:\\student\\student.ser");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(stu);
            oos.flush();
            oos.close();
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
