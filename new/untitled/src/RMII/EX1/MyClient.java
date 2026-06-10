package RMII.EX1;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyClient {
    public static void main(String[] args) {
        try{
            Hello stub=((Hello) Naming.lookup("rmi://localhost:2045/vihanga"));
            System.out.println(stub.printhello());
        } catch (RemoteException | NotBoundException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
