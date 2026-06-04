package Serialization.EX_04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MySerializer {
    public void myuniserilizer(UniEmployee uni) {
        try{
            FileOutputStream fos=new FileOutputStream("C:\\student\\uni.ser");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(uni);
            oos.flush();
            oos.close();
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
