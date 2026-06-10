package RMII.calculotor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Myserver {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(54321);
            Calcultor cal=new CalculatorRemote();
            Naming.rebind("rmi://localhost:54321/cal",cal);
            System.out.println( "Server ready" );
        }catch(RemoteException | MalformedURLException e){
                throw new RuntimeException(e);
            }

        }
}