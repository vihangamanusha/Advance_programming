package Serialization.EX_03;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MySerializer {
     public void myserializerdog(Dog d) {
         try{
             FileOutputStream fos = new FileOutputStream("C:\\student\\Dog.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos);
             oos.writeObject(d);
             oos.flush();
             oos.close();
             fos.close();

         } catch (Exception e) {
             throw new RuntimeException(e);
         }
     }
}
