package parentnot_serliza;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Myserilizer {
    public void myserilizer(UniEmployee uni) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\student\\Myserilizer.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(uni);
            oos.close();
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
