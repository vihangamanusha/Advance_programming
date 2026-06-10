package RMII.newnew;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class MyServer {
    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(1055);
            NewStudent stub=new NewStudentImpl();
            Naming.rebind("rmi://localhost:1055/newstudent",stub);
            System.out.println("Server ready");
        } catch (RuntimeException | RemoteException | MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
