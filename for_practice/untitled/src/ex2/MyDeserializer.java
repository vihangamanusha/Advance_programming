package ex2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyDeserializer {
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream("C:\\student\\person.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Student s=(Student)ois.readObject();
            System.out.println(s.name);
            System.out.println(s.id);
            ois.close();
            fis.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
