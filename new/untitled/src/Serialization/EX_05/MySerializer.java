package Serialization.EX_05;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MySerializer{
    public void serializeruni(UniEmployee uni){
        try{
            FileOutputStream ois=new FileOutputStream("C:\\student\\uni.ser");
            ObjectOutputStream oos=new ObjectOutputStream(ois);
            oos.writeObject(uni);
            oos.flush();
            oos.close();
            ois.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
