import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyDeserilization {
    public void deserilize() {
        try{
            FileInputStream fis=new FileInputStream("C:\\student\\car.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Car car=(Car)ois.readObject();
            System.out.println(car.toString());
            fis.close();
            ois.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
