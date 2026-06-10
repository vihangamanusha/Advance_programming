package RMII.EX1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    public String printhello() throws RemoteException;
}
