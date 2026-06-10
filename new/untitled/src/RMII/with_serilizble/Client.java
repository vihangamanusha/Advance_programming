package RMII.with_serilizble;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
       try{
           StudentService stub=(StudentService) Naming.lookup("rmi://localhost:54214/student");

           newStudent s=stub.getnewStudent("tg/001");

           System.out.println("ID :"+s.getStu_id());
           System.out.println("Name :"+s.getStu_name());
           System.out.println("address :"+s.getStu_address());

       } catch (RuntimeException e) {
           throw new RuntimeException(e);
       }
    }
}
