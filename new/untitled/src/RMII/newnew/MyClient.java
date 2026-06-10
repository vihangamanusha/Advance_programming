package RMII.newnew;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyClient {
    public static void main(String[] args) {
        try{
            NewStudent stub=(NewStudent) Naming.lookup("rmi://localhost:1055/newstudent");
            Student s=stub.getStudent("tg/002");
            System.out.println(s.toString());

        } catch (RuntimeException | RemoteException | NotBoundException | MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
