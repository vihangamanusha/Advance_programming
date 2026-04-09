package ex1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Mydeserialzer {
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream("C:\\student\\student.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Student stu=(Student)ois.readObject();
            System.out.println(stu.getId());
            System.out.println(stu.getName());
            System.out.println(stu.getAge());
            System.out.println(stu.getPassword());
            ois.close();
            fis.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
