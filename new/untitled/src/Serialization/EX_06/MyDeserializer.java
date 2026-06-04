package Serialization.EX_06;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyDeserializer {
    public void vehicalDeserializer() {
        try {
            FileInputStream fis = new FileInputStream("C:\\student\\car.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Car car = (Car) ois.readObject();
            System.out.println(car.toString());
            ois.close();
            fis.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
