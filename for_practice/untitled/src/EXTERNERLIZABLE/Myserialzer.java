package EXTERNERLIZABLE;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Myserialzer {
    public void Myserialzercar(Car car) {
        try{
            FileOutputStream fos=new FileOutputStream("C:\\student\\car.ser");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(car);
            oos.close();
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
