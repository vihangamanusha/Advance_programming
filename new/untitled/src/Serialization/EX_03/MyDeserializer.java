package Serialization.EX_03;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyDeserializer {
    public void mydeserialzerdog() {
        try{
            FileInputStream fis=new FileInputStream("C:\\student\\Dog.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Dog d=(Dog)ois.readObject();
            System.out.println(d.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
