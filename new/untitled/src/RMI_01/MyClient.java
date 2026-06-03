package RMI_01;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class MyClient {
    public static void main(String args[]) {
        try{
            Hello stub=(Hello) Naming.lookup("rmi//localhost:1099//Hello");
            System.out.println(stub.printHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
