import java.io.*;

public class MySerialization {
    public void serialize(Car car) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\student\\car.ser");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(car);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

