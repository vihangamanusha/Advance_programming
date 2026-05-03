import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Myserializer {
    public static void main(String[] args) {
        Student stu = new Student(1, "vihanga");
        Student.setAge(25);
        stu.setPassword(123456);


        try {
            FileOutputStream fos = new FileOutputStream("C:\\student\\student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(stu);
            oos.close();
            fos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);


        }
    }
}
