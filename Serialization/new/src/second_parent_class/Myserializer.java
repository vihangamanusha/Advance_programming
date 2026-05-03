package second_parent_class;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Myserializer {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.id=10;
        stu.name = "vihanga";

        try{
            FileOutputStream fos = new FileOutputStream("C:\\student\\student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(stu);
            oos.close();
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
