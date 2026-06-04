package Serialization.EX_04;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyDeserializer {
    public void myunideserilizer() {
        try{
            FileInputStream fis = new FileInputStream("C:\\student\\uni.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            UniEmployee uni=(UniEmployee)ois.readObject();
            System.out.println(uni.toString());
            ois.close();
            fis.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
