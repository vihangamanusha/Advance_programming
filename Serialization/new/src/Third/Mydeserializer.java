package Third;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Mydeserializer {
    public void Mydeserialize() {
        try{
            FileInputStream fis=new FileInputStream("C:\\student\\student.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Dog d=(Dog)ois.readObject();
            System.out.println(d.toString());
            ois.close();
            fis.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
