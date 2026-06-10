package RMII.EX1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteHello extends UnicastRemoteObject implements Hello {
    public RemoteHello() throws RemoteException{
        super();
    }

    public String printhello(){
        return "Hello World";
    }
}
