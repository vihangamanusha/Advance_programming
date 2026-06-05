package File_Writing_Reading;

import java.io.BufferedReader;
import java.io.FileReader;

public class Reader {
    public static void main(String[] args) {
        try{
            BufferedReader reader=new BufferedReader(new FileReader("students.txt"));

            String line;

            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}