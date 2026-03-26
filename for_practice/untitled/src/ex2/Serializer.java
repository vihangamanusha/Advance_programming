package ex2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializer {
    public static void main(String[] args) {
        Student s = new Student();

        s.id = 1;
        s.name = "John Doe";

        try{
            FileOutputStream fos = new FileOutputStream("C:\\student\\person.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.flush();
            oos.close();
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
