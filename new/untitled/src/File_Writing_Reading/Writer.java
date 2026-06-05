package File_Writing_Reading;

import java.io.FileWriter;

public class Writer {
    public static void main(String[] args) {
        try{
            FileWriter writer=new FileWriter("students.txt");
            writer.write("hello world");
            writer.close();
            System.out.println("Done");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}