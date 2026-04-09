package EXTERNERLIZABLE;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Mydeseralizer {
    public void Mydeseralizercar() {
        try{
            FileInputStream fis=new FileInputStream("C:\\student\\car.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Car car=(Car)ois.readObject();
            System.out.println(car.toString());
            ois.close();
            fis.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
