import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fileread {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("vihanga.txt"));

            String line;

            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
