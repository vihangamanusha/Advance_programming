package Fourth;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Mydeserializer {
    public void Mydeserialize() {
        try{
            FileInputStream fis = new FileInputStream("C:\\student\\student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Uniemployee un =(Uniemployee) ois.readObject();
            System.out.println(un.toString());
            fis.close();
            ois.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}