package RMI_01;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class MyServer {
    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(1099);
            Hello stub=new HelloRemote();
            Naming.rebind("rmi//localhost:1099//Hello", stub);
            System.out.println("Server ready");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
