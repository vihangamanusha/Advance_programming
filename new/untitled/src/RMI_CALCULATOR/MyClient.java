package RMI_CALCULATOR;

import java.rmi.Naming;

public class MyClient {
    public static void main(String[] args) {
        try{
          Calculator cal=(Calculator) Naming.lookup("rmi://localhost:1099/cal");
          System.out.println("Addition :"+cal.add(1,2));
          System.out.println("Division :"+cal.division(4,2));
          System.out.println("Multiply :"+cal.multiply(2,2));
          System.out.println("Substract :"+cal.substract(10,0));
        }catch (Exception e){
        e.printStackTrace();
    }
    }
}
