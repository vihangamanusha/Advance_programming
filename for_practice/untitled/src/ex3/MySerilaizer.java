package ex3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MySerilaizer {
    public void serilizer(Dog d) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\student\\new.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d);
            oos.close();
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
