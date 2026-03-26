package parentnot_serliza;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Mydeserilizer {
       public void mydeserilizer() {
           try{
               FileInputStream Fis = new FileInputStream("C:\\student\\Myserilizer.txt");
               ObjectInputStream Ois = new ObjectInputStream(Fis);
               UniEmployee uni = (UniEmployee) Ois.readObject();
               System.out.println(uni.toString());

               Ois.close();
           } catch (Exception e) {
               throw new RuntimeException(e);
           }
       }
}
