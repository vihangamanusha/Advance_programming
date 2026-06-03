package Serialization.EX_01;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MySerializer {
    public static void main(String[] args) {
        Student stu=new Student(1388,"vihaga");
        Student.setAge(24.00);
        stu.setPassword(123456);

        try{
            FileOutputStream fos=new FileOutputStream("C:\\student\\student.ser");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(stu);
            oos.flush();
            oos.close();
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
