import java.io.FileWriter;
import java.io.IOException;

public class filewrite {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("vihanga.txt");
            writer.write("hello ");
            writer.write("world");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
