package RMII.EX1;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class MyServer {
    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(2045);
            Hello stub=new RemoteHello();
            Naming.rebind("rmi://localhost:2045/vihanga",stub);
            System.out.println("Server ready");

        } catch (RemoteException | MalformedURLException e){
            e.printStackTrace();
        }
    }
}
