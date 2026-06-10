package RMII.with_serilizble;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(54214);
            StudentService stub=new StudentServiceRemote();
            Naming.rebind("rmi://localhost:54214/student", stub);
            System.out.println("Server ready");
        } catch (RuntimeException | RemoteException | MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}

