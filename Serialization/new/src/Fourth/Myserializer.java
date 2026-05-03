package Fourth;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Myserializer {
    public void Myserialize(Uniemployee un) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\student\\student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(un);
            oos.close();
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
