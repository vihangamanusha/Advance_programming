package Serialization.EX_06;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MySerializer {
    public void vehicalserilazer(Car car) {
        try{
            FileOutputStream fos=new FileOutputStream("C:\\student\\car.ser");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(car);
            oos.flush();
            oos.close();
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
