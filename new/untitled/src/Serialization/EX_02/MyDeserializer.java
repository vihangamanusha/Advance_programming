package Serialization.EX_02;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyDeserializer {
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream("C:\\student\\student.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Student stu=(Student)ois.readObject();
            System.out.println(stu.id+" "+stu.name);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
