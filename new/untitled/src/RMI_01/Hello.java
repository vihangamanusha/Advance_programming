package RMI_01;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    public String printHello() throws RemoteException;
}
