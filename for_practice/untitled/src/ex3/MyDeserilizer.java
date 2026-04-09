package ex3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyDeserilizer {
    public void desriizer(){
        try{
            FileInputStream fis = new FileInputStream("C:\\student\\new.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Dog d = (Dog)ois.readObject();
            System.out.println(d.toString());
            ois.close();
            fis.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
