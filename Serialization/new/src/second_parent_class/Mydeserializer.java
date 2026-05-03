package second_parent_class;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Mydeserializer {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\student\\student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            try {
                Student student=(Student) ois.readObject();
                System.out.println(student.id);
                System.out.println(student.name);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
