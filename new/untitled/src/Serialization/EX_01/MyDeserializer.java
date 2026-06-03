package Serialization.EX_01;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyDeserializer {
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream("C:\\student\\student.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Student student=(Student)ois.readObject();
            System.out.println(student.getId());
            System.out.println(student.getName());
            System.out.println(student.getAge());
            ois.close();
            fis.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
