package Third;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Myserializer {
    public void Myserialize(Dog d) {
        try{
            FileOutputStream fos=new FileOutputStream("C:\\student\\student.ser");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(d);
            oos.close();
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
